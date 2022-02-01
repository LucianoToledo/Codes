package libreria.Services;

import libreria.persistencia.EditorialDAO;

public class EditorialService {

    private final EditorialDAO dao;

    public EditorialService() {
        dao = new EditorialDAO();
    }
}
