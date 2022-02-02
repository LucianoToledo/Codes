package libreria;

import libreria.Services.AutorService;
import libreria.Services.EditorialService;
import libreria.Services.LibroService;

public class libreriaMAIN {

    public static void main(String[] args) {
        AutorService autorService = new AutorService();
        EditorialService editorialService = new EditorialService();
        LibroService libroService = new LibroService();

//        autorService.crear("1", "Lucho", Boolean.FALSE); 
//        autorService.crear("2","Cristian", Boolean.FALSE);
//        autorService.crear("3","Pancho", Boolean.FALSE);
//        autorService.crear("4","Jonas", Boolean.FALSE);

          
          editorialService.crear("1", Boolean.TRUE,"aaaa");
          editorialService.crear("2", Boolean.TRUE,"bbbb");
          editorialService.crear("3", Boolean.TRUE, "cccc");
          
          //    public Libro(String id,String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Editorial editorial, Autor autor) {
//          libroService.crear("1", "Harry Potter",2005, 100,44, 66, Boolean.FALSE, editorialService.buscarPorId("1"), autorService.buscarPorID("1"));
//          libroService.crear("2", "Frankensetin",1885, 80,41, 39, Boolean.FALSE, editorialService.buscarPorId("2"), autorService.buscarPorID("2"));
//          libroService.crear("3", "Romeo y Julietar",1900, 20,2, 18, Boolean.FALSE, editorialService.buscarPorId("3"), autorService.buscarPorID("3"));
//    
        System.out.println("-----------");

        System.out.println(autorService.buscarPorNombre("Lucho"));
    }

}
