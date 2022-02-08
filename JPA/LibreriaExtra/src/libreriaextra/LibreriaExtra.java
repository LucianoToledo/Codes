package libreriaextra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
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
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String opc, nombreCli, apeClie, telCli;
        String fechaDevolucionPrestamo;
        String idLibro, idCliente;
        String tituloLibro, idEditorial, idAutor;
        Integer anioLibro, ejemplaresLibro, ejemplaresPrestadosLibro;
        Long documentoCliente;
        boolean flagLibro = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

        try {
            do {
                System.out.println("----MENU--- \n"
                        + "1 - Crear Cliente\n"
                        + "2 - Crear Libro\n"
                        + "3 - Registrar el prestamo de un libro\n"
                        + "4 - Devolucion de un libro\n"
                        + "5 - Buscar de todos los prestamos de un Cliente\n"
                        + "6 - Mostrar Libros\n"
                        + "7 - Mostrar Autores\n"
                        + "8 - Mostrar Editoriales\n"
                        + "9 - Mostrar Prestamos\n"
                        + "10 - Mostrar Clientes\n"
                        + "S - Salir\n"
                        + "");
                opc = input.next();

                switch (opc) {
                    case "1":

                        System.out.println("Ingrese documento");
                        documentoCliente = input.nextLong();
                        System.out.println("Ingrese Nombre");
                        nombreCli = input.next();
                        System.out.println("Ingrese Apellido");
                        apeClie = input.next();
                        System.out.println("Ingrese numero de Telefono");
                        telCli = input.next();
                        Cliente c = clienteService.crear(documentoCliente, nombreCli, apeClie, telCli);
                        if (c == null) {
                            System.out.println("No se ha podido crear el cliente");
                        } else {
                            System.out.println("Cliente creado");
                            System.out.println(c);
                        }
                        break;

                    case "2":

                        System.out.println("Ingrese titulo");
                        tituloLibro = input.next();
                        System.out.println("Ingrese anio de " + tituloLibro);
                        anioLibro = input.nextInt();
                        System.out.println("Ingrese cantidad de ejemplares de " + tituloLibro);
                        ejemplaresLibro = input.nextInt();
                        do {
                            System.out.println("Ingrese cantidad de ejemplares prestados de " + tituloLibro);
                            ejemplaresPrestadosLibro = input.nextInt();
                            if (ejemplaresLibro >= ejemplaresPrestadosLibro) {
                                flagLibro = true;
                            }
                        } while (!flagLibro);

                        System.out.println("Ingrese id Editorial");
                        editorialService.listarTodos();
                        idEditorial = input.next();

                        System.out.println("Ingrese id Autor");
                        autorService.listarAutores();
                        idAutor = input.next();

                        libroService.crear(tituloLibro, anioLibro, ejemplaresLibro, ejemplaresPrestadosLibro, ejemplaresLibro - ejemplaresPrestadosLibro, idEditorial, idAutor);
                        break;
                        //se puede agregar la funcion desde aca si quiere agregar a otro autor o editorial
                    case "3":

                        System.out.println("Ingrese fecha de devolucion");
                        fechaDevolucionPrestamo = input.next();

                        System.out.println(" Ingrese id del libro");
                        libroService.listarLibros();
                        idLibro = input.next();

                        System.out.println("Ingrese id cliente");
                        clienteService.listarClientes();
                        idCliente = input.next();

                        prestamosService.crear(new Date(), sdf.parse(fechaDevolucionPrestamo), idLibro, idCliente); //https://es.stackoverflow.com/questions/5043/c%C3%B3mo-se-lee-una-date-por-scanner
                        break;
                    case "4":
                        prestamosService.listarTodos();
                        System.out.println("Ingrese el id del prestamo a eliminar");
                        String idEliminarPrestamo = input.next();
                        prestamosService.eliminar(idEliminarPrestamo);
                        break;
                    case "5":
                        clienteService.listarClientes();
                        System.out.println("Ingrese id cliente");
                        String idClientePrestamo = input.next();
                        for (Prestamo aux : prestamosService.buscarPrestamoDeUnCliente(idClientePrestamo)) {
                            System.out.println(aux);
                        }
                        break;
                    case "6":
                        libroService.listarLibros();
                        break;
                    case "7":
                        autorService.listarAutores();
                        break;
                    case "8":
                        editorialService.listarTodos();
                        break;
                    case "9":
                        prestamosService.listarTodos();
                        break;
                    case "10": 
                        clienteService.listarClientes();
                        break;

                }
            } while (!opc.equalsIgnoreCase("S"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}


//        //1. Creación de un Cliente nuevo
            //       Cliente cliente = clienteService.crear(Long.valueOf(40123456), "Lucho", "Toledo", "2611234567");
            //       
            //       //3. Registrar el préstamo de un libro.
            //        Editorial editorial = editorialService.crear("Aaaa");
            //        Autor autor = autorService.crear("Jonas");
            //        
            //        Libro libro = libroService.crear("Harry Potter", 2004, 50, 23, 27, editorial, autor);
            //
            //            Libro libro = libroService.buscarPorIsbn("4");
            //            System.out.println(libro);
            //            Cliente cliente = clienteService.buscarPorId("1");
            //            System.out.println(cliente);
            //
            //            prestamosService.crearVoid(new Date(), new Date(), libro, cliente);
//            prestamosService.listarTodos();
//            System.out.println("------------");

            //4. Devolución de un libro
//            System.out.println("Ingrese el id del prestamo a eliminar");
//            String idEliminarPrestamo = input.next();
//            
//            prestamosService.eliminar(idEliminarPrestamo);
//5. Búsqueda de todos los prestamos de un Cliente