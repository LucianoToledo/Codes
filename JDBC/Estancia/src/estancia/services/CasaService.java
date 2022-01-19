
package estancia.services;

import estancia.entidades.Casa;
import estancia.persistencia.CasaDAO;
import java.util.List;

public class CasaService {
    
    private CasaDAO dao;

    public CasaService() {
        this.dao = new CasaDAO();
    }
    
    //b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de
    //agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
    public List<Casa> listarCasas() throws Exception{
        List<Casa> casas = dao.listasCasa();
        return casas;
    }
    
    public void mostrarCasas() throws Exception{
        List<Casa> casas = listarCasas();
        
        for (Casa aux : casas) {  //verficar porque no muestra nada xd
            System.out.println(aux);
        }
    }
    
}
