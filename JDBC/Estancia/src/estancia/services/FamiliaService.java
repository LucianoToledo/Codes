package estancia.services;

import estancia.entidades.Familia;
import estancia.persistencia.FamiliaDAO;
import java.util.List;

public class FamiliaService {

    private FamiliaDAO dao;

    public FamiliaService() {
        this.dao = new FamiliaDAO();
    }

    // a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public List<Familia> listarFamilia() throws Exception {
        List<Familia> familias = dao.listarFamilia();
        return familias;
    }

    public void mostrarFamilia() throws Exception {
        List<Familia> familias = listarFamilia();

        for (Familia familia : familias) {
            System.out.println(familia);
        }
    }
    
    //c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
    public List<Familia> listarFamiliaHotmail() throws Exception {
        List<Familia> familias = dao.listarFamiliaHotmail();
        return familias;
    }
    
    public void mostrarFamiliaHotmail() throws Exception {
        List<Familia> familias = listarFamiliaHotmail();

        for (Familia familia : familias) {
            System.out.println(familia);
        }
    }
    

}
