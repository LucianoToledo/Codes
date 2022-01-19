package estancia.persistencia;

import estancia.entidades.Casa;
import java.util.ArrayList;
import java.util.List;

public class CasaDAO extends DAO {

//b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de
//agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.
    
    public List<Casa> listasCasa() throws Exception{
        
        List<Casa> casas = new ArrayList();
        
        try {
            
            consultarBase("SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31' AND pais LIKE 'Reino Unido'");
            
            while (resultado.next()) {                
                Casa c = new Casa();
                
                c.setId_casa(resultado.getInt("id_casa"));
                c.setCalle(resultado.getString("calle"));
                c.setNumero(resultado.getInt("numero"));
                c.setCodigo_postal(resultado.getString("codigo_postal"));
                c.setCiudad(resultado.getString("ciudad"));
                c.setFecha_desde(resultado.getDate("fecha_desde"));
                c.setFecha_hasta(resultado.getDate("fecha_hasta"));
                c.setTiempo_minimo(resultado.getInt("tiempo_minimo"));
                c.setTiempo_maximo(resultado.getInt("tiempo_maximo"));
                c.setPrecio_habitacion(resultado.getDouble("precio_habitacion"));
                c.setTipo_vivienda(resultado.getString("tipo_vivienda"));
                //c.setEstanciasCasas((ArrayList<Estancia>) resultado.getArray("estanciasCasa"));
                //c.setFamilias((ArrayList<Familia>) resultado.getArray("estanciasCasa"));
                //c.setEstanciasCasas((ArrayList<Estancia>) resultado.getArray("estanciasCasa"));
            }
            
        } catch (Exception e) {
          throw e;
        } finally {
            desconectarBase();
        }
        
        return casas;
    }
}
