package libreria.Services;

import libreria.persistencia.LibroDAO;

public class LibroService {
    
    private final LibroDAO dao;
    
    public LibroService(){
        dao = new LibroDAO();
    }
}
