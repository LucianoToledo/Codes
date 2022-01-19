package estancia.persistencia;

import estancia.entidades.Familia;
import java.util.ArrayList;
import java.util.List;

public class FamiliaDAO extends DAO {
    //a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    
      public List<Familia> listarFamilia() throws Exception {

        List<Familia> familias = new ArrayList();

        try {
            consultarBase("SELECT * FROM familias WHERE num_hijos >=3 AND edad_maxima<10");

            System.out.println(resultado.toString());

            while (resultado.next()) {
                Familia f = new Familia();

                f.setId_familia(resultado.getString("id_familia"));
                f.setNombre(resultado.getString("nombre"));
                f.setEdad_minima(resultado.getInt("edad_minima"));
                f.setEdad_maxima(resultado.getInt("edad_maxima"));
                f.setNum_hijos(resultado.getInt("num_hijos"));
                f.setEmail(resultado.getString("email"));

                familias.add(f);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return familias;

    }
}
