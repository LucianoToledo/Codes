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

    public Fabricante buscarPorCodigo(int cod) throws Exception {
        Fabricante f = new Fabricante();

        try {

            consultarBase("SELECT * FROM fabricante WHERE codigo = +" + cod);

            while (resultado.next()) {
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

        return f;
    }
}
