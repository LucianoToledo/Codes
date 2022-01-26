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
    public List<Casa> listarCasas() throws Exception {
        List<Casa> casas = dao.listasCasa();
        return casas;
    }

    public void mostrarCasas() throws Exception {
        List<Casa> casas = listarCasas();

        for (Casa c : casas) {
            System.out.println(c);
        }
    }

    //d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específic
    public List<Casa> listarCasasPorFechaIngresada(String fechaDesde, int dias) throws Exception {
        List<Casa> casas = dao.listarCasasPorFechaIngresada(fechaDesde, dias);
        return casas;
    }

    public void mostrarCasasPorFechaIngresada(String fechaDesde, int dias) throws Exception {
        List<Casa> casas = listarCasasPorFechaIngresada(fechaDesde, dias);

        for (Casa c : casas) {
            System.out.println(c);
        }
    }

    //h) Obtener el número de casas que existen para cada uno de los países diferentes
    public List<Casa> numCasaPorPais() throws Exception {
        List<Casa> numCasas = dao.numCasaPorPais();
        return numCasas;
    }

    public void mostrarNumCasasPorPais() throws Exception {
        List<Casa> numCasas = numCasaPorPais();
        int i = 0;
        for (Casa numCasa : numCasas) {
            i++;
            System.out.println(numCasa.getPais());
//            if (!numCasa.getPais().equals(numCasa.getPais().next())){
//                
//            }

        }
        System.out.println(i);
    }
}
