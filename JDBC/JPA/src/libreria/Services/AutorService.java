package libreria.Services;

import libreria.persistencia.AutorDAO;

public class AutorService {

    private final AutorDAO dao;

    public AutorService() {
        dao = new AutorDAO();
    }
}
