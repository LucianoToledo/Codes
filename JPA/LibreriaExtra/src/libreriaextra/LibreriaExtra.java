package libreriaextra;

import java.util.Date;
import libreriaextra.Entities.Autor;
import libreriaextra.Entities.Cliente;
import libreriaextra.Entities.Editorial;
import libreriaextra.Entities.Libro;
import libreriaextra.Entities.Prestamo;
import libreriaextra.Services.AutorService;
import libreriaextra.Services.ClienteService;
import libreriaextra.Services.EditorialService;
import libreriaextra.Services.LibroService;
import libreriaextra.Services.PrestamoService;

public class LibreriaExtra {

    public static void main(String[] args) {
        AutorService autorService = new AutorService();
        EditorialService editorialService = new EditorialService();
        LibroService libroService = new LibroService();
        ClienteService clienteService = new ClienteService();
        PrestamoService prestamosService = new PrestamoService();
        Date date = new Date();
        try {

//        //1. Creación de un Cliente nuevo
//       Cliente cliente = clienteService.crear(Long.valueOf(40123456), "Lucho", "Toledo", "2611234567");
//       
//       //3. Registrar el préstamo de un libro.
//        Editorial editorial = editorialService.crear("Aaaa");
//        Autor autor = autorService.crear("Jonas");
//        
//        Libro libro = libroService.crear("Harry Potter", 2004, 50, 23, 27, editorial, autor);


            Libro libro = libroService.buscarPorIsbn("4");
            System.out.println(libro);
            Cliente cliente = clienteService.buscarPorId("1");
            System.out.println(cliente);

            prestamosService.crearVoid(new Date(), new Date(), libro, cliente);

            prestamosService.listarTodos();

            //4. Devolución de un libro
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
