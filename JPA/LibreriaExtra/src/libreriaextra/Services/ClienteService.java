package libreriaextra.Services;

import java.util.List;
import libreriaextra.Entities.Cliente;
import libreriaextra.Persistencia.ClienteDAO;

public class ClienteService {

    private final ClienteDAO dao;

    public ClienteService() {
        dao = new ClienteDAO();
    }

    public Cliente crear(Long documento, String nombre, String apellido, String telefono) throws Exception{

        Cliente cliente = new Cliente();
        try {
            cliente.setDocumento(documento);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            dao.guardar(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Cliente buscarPorId(String id) throws Exception {
        Cliente c = dao.buscarPorId(id);
        validarClienteNull(c);
        return c;
    }

    private void validarClienteNull(Cliente c) throws Exception {
        if (c == null) {
            throw new Exception("No existe ese autor");
        }
    }

    private void validarListaClienteNull(List<Cliente> c) throws Exception {

        if (c.isEmpty()) {
            throw new Exception("No existe ese autor");
        }
    }
}
