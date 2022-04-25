package com.libreria.services;

import com.libreria.errores.ErrorServicio;
import com.libreria.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.libreria.entidades.Cliente;
import com.libreria.entidades.Prestamo;
import com.libreria.enums.RolUsuario;
import com.libreria.repositorios.PrestamoRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class ClienteService implements UserDetailsService{

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PrestamoRepositorio prestamoRepositorio;

    @Transactional(rollbackFor = {Exception.class})
    public void agregarCliente(String nombre, String apellido, String telefono, String email, String password, String confirmarPassword) throws ErrorServicio {
        validarDatos(nombre, apellido, telefono); //tambien hay que validar si las contraseñas son identicas
        String passEncrip = new BCryptPasswordEncoder().encode(password);
        Cliente cliente = new Cliente(nombre, apellido, telefono, true, new Date(), null, email, passEncrip, RolUsuario.ADMIN);
        clienteRepositorio.save(cliente);
    }

    @Transactional
    public void modificarCliente(String id, String nombre, String apellido, String telefono, String documento) throws Exception {
        validarDatos(nombre, apellido, telefono);
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            clienteRepositorio.save(cliente);
        } else {
            throw new ErrorServicio("No se encontro el Cliente");
        }
    }

    @Transactional
    public void bajaCliente(String id) throws ErrorServicio {
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);
        if (respuesta.isPresent()) {
            //validarClienteAsignado(respuesta, "dar de baja");
            Cliente cliente = respuesta.get();
            if (cliente.isActivo()) {
                cliente.setFechaBajaCliente(new Date());
                cliente.setActivo(false);
                clienteRepositorio.save(cliente);
            } else {
                throw new ErrorServicio("El Cliente ya se encuentra dado de Baja");
            }
        } else {
            throw new ErrorServicio("No se encontro el Cliente");
        }
    }

    @Transactional
    public void altaCliente(String id) throws ErrorServicio {
        Optional<Cliente> respuestaCliente = clienteRepositorio.findById(id);
        if (respuestaCliente.isPresent()) {
            Cliente cliente = respuestaCliente.get();
            if (!cliente.isActivo()) {
                cliente.setFechaBajaCliente(null);
                cliente.setFechaAltaCliente(new Date());
                cliente.setActivo(true);
                clienteRepositorio.save(cliente);
            } else {
                throw new ErrorServicio("El Cliente ya se encuentra dado de Alta");
            }
        } else {
            throw new ErrorServicio("No se encontro el Cliente");
        }
    }

    @Transactional(readOnly = true)
    public Cliente buscarPorId(String id) throws ErrorServicio {
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);
        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new ErrorServicio("No se encontro el Cliente");
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll();
        return clientes;
    }

    @Transactional(rollbackFor = {Exception.class})

    public void eliminarCliente(String id) throws ErrorServicio {
        Optional<Cliente> respuestaCliente = clienteRepositorio.findById(id);

        if (validarClienteAsignado(respuestaCliente, "eliminar")) {
            clienteRepositorio.deleteById(id);
        }
    }

    @Transactional(readOnly = true)                          //  ACA HAY QUE TRAER LOS LIBROS QUE TIENEN LOS PRESTAMOS DE ESE CLIENTE   CORREGIR!!
    public boolean validarClienteAsignado(Optional<Cliente> respuestaCliente, String mensajeError) throws ErrorServicio {

        boolean flag = true;
        if (respuestaCliente.isPresent()) {
            List<Prestamo> respuestaPrestamo = prestamoRepositorio.buscarPorIdCliente(respuestaCliente.get().getId());
            if (!respuestaPrestamo.isEmpty()) {
                String errorMessage = "No fue posible " + mensajeError + " al Cliente: ''" + respuestaCliente.get().getNombre() + " " + respuestaCliente.get().getApellido() + "'' porque tiene prestados los siguientes libros: \n";
                for (Prestamo prestamo : respuestaPrestamo) {
                    errorMessage += "-''" + prestamo.getLibro().getTitulo() + "'' \n";
                    flag = false;
                }
                throw new ErrorServicio(errorMessage);
            }
        } else {
            throw new ErrorServicio("No se encontro el Cliente");
        }
        return flag;
    }

    private void validarDatos(String nombre, String apellido, String telefono) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("Error: El nombre del Cliente no puede ser nulo");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new ErrorServicio("Error: El apellido del Cliente no puede ser nulo");
        }
        if (telefono == null || telefono.isEmpty()) {
            throw new ErrorServicio("Error: El telefono del Cliente no puede ser nulo");
        }
        if (!telefono.matches("[+-]?\\d*(\\.\\d+)?")) {  //https://www.delftstack.com/es/howto/java/how-to-check-if-a-string-is-a-number-in-java/
            throw new ErrorServicio("Error: El télefono del Cliente debe ser numerico");
        }
    }

   @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Cliente c = clienteRepositorio.buscarPorEmail(email);

        if (c == null) {
            return null;
        }  

        List<GrantedAuthority> permisos = new ArrayList<>();

        GrantedAuthority p1 = new SimpleGrantedAuthority("ROLE_" + c.getRolUsuario().toString());
        permisos.add(p1);

        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

        HttpSession session = attr.getRequest().getSession(true);
        session.setAttribute("usuariosession", c);

        return new User(c.getEmail(), c.getPassword(), permisos);

    }
}
