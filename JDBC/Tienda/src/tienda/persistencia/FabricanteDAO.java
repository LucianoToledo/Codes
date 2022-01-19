package tienda.persistencia;

import tienda.entidades.Fabricante;

public class FabricanteDAO extends DAO {

    public void ingresarFabricante(Fabricante f) throws Exception {

        try {

            String sql = "INSERT INTO fabricante (codigo, nombre) VALUES ( '" + f.getCodigo() + "' ,'" + f.getNombre() + "' )";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }
    }

    public void modificarFabricante(Fabricante f) throws Exception {

        try {

            String sql = "UPDATE fabricante SET nombre='" + f.getNombre() + "' WHERE codigo = '" + f.getCodigo() + "'";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
}
