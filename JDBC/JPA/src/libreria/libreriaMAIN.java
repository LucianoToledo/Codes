package libreria;

import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.Services.AutorService;
import libreria.Services.EditorialService;
import libreria.Services.LibroService;

public class libreriaMAIN {

    public static void main(String[] args) throws Exception {

        AutorService autorService = new AutorService();
        EditorialService editorialService = new EditorialService();
        LibroService libroService = new LibroService();

//        autorService.crear("1", "Lucho", Boolean.FALSE); 
//        autorService.crear("2","Cristian", Boolean.FALSE);
//        autorService.crear("3","Pancho", Boolean.FALSE);
//        autorService.crear("4","Jonas", Boolean.FALSE);
//          editorialService.crear("1", Boolean.TRUE,"aaaa");
//          editorialService.crear("2", Boolean.TRUE,"bbbb");
//             editorialService.crear("cccc");
//             editorialService.crear("dddd");
//          libroService.crear("1", "Harry Potter",2005, 100,44, 66, Boolean.FALSE, editorialService.buscarPorId("1"), autorService.buscarPorID("1"));
//          libroService.crear("2", "Frankensetin",1885, 80,41, 39, Boolean.FALSE, editorialService.buscarPorId("2"), autorService.buscarPorID("2"));
//          libroService.crear("3", "Romeo y Julietar",1900, 20,2, 18, Boolean.FALSE, editorialService.buscarPorId("3"), autorService.buscarPorID("3"));
//    
        System.out.println("-----------");

//        System.out.println(autorService.buscarPorNombre("Lucho"));
//        for (Editorial aux : editorialService.listarTodos()) {
//            System.out.println(aux);
//        }
        //editorialService.eliminar("51");
        // libroService.eliminar("1");
//        libroService.eliminar("2");
//        libroService.eliminar("3");
//        Editorial ed1 = editorialService.buscarPorId("1");
//        Editorial ed2 = editorialService.buscarPorId("2");
//        Editorial ed3 = editorialService.buscarPorId("3");
//        
//        Autor a1 = autorService.buscarPorID("1");
//        Autor a2 = autorService.buscarPorID("2");
//        Autor a3 = autorService.buscarPorID("3");
//        
//        libroService.crear( "Harry Potter", 2005, 100, 44, 66, Boolean.TRUE, ed1, a1);
//        libroService.crear("Frankensetin", 1885, 80, 41, 39, Boolean.FALSE, ed2, a2);
//        libroService.crear("Romeo y Julietar", 1900, 20, 2, 18, Boolean.FALSE, ed3, a3);
//        libroService.crear("asdr", 1900, 20, 2, 18, Boolean.FALSE, ed3, a3);
//
//        for (Libro aux : libroService.listarLibros()) {
//            System.out.println(aux);
//        }
        System.out.println(editorialService.buscarPorId("1"));
        try {

            System.out.println(libroService.buscarLibroPorAutor("Lucho"));
            System.out.println(libroService.buscarPotTitulo("Harry Potter"));
            System.out.println(libroService.buscarLibroPorEditorial("aaaa"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
