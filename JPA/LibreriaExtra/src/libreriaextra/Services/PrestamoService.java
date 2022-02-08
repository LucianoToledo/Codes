package libreriaextra.Services;

import java.util.Date;
import java.util.List;
import libreriaextra.Entities.Cliente;
import libreriaextra.Entities.Libro;
import libreriaextra.Entities.Prestamo;
import libreriaextra.Persistencia.PrestamoDAO;

public class PrestamoService {

    private final PrestamoDAO dao;
    private final LibroService libroService;
    private final ClienteService clienteService;

    public PrestamoService() {
        dao = new PrestamoDAO();
        libroService = new LibroService();
        clienteService = new ClienteService();
    }

    public Prestamo crear(Date fechaPrestamo, Date fechaDevolucion, String isbn, String id) throws Exception {
        Prestamo prestamo = new Prestamo();
        try {
            prestamo.setFechaPrestamo(fechaPrestamo);
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamo.setLibro(libroService.buscarPorIsbn(isbn));
            prestamo.setCliente(clienteService.buscarPorId(id));
            dao.guardar(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Prestamo crear(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) throws Exception {
        Prestamo prestamo = new Prestamo();
        try {
            prestamo.setFechaPrestamo(fechaPrestamo);
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamo.setLibro(libro);
            prestamo.setCliente(cliente);
            dao.guardar(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void crearVoid(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) throws Exception {
        Prestamo prestamo = new Prestamo();
        try {
            prestamo.setFechaPrestamo(fechaPrestamo);
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamo.setLibro(libro);
            prestamo.setCliente(cliente);
            dao.guardar(prestamo);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    
    public Prestamo buscarPorId(String id){
        return dao.buscarPorId(id);
    }    
    
    public void eliminar(String id) throws Exception{
        Prestamo p = buscarPorId(id);
        validarPrestamoNull(p);
        dao.eliminar(p);
    }
    
    
     public void listarTodos() {
        try {
            List<Prestamo>pre = dao.listarTodos();
            for (Prestamo prestamo : pre) {
                System.out.println(prestamo);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
     
     public List<Prestamo> buscarPrestamoDeUnCliente(String id) throws Exception {
         List<Prestamo> pr = dao.buscarPrestamoDeUnCliente(id);
         validarListaPrestamoNull(pr);
         return pr;
     }
     
     private void validarPrestamoNull(Prestamo p) throws Exception {
        if (p == null) {
            throw new Exception("No existe ese libro");
        }
    }

    private void validarListaPrestamoNull(List<Prestamo> p) throws Exception {

        if (p.isEmpty()) {
            throw new Exception("No existe ese libro");
        }
    }

}
