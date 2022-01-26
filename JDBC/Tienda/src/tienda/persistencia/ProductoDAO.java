package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

public class ProductoDAO extends DAO {

    public List<Producto> listarTodos() throws Exception {

        List<Producto> productos = new ArrayList();

        try {
            consultarBase("SELECT * FROM producto");
            System.out.println(resultado.toString());

            while (resultado.next()) {
                Producto producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);

            }

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return productos;
    }

    public List<Producto> seleccionarNombrePrecio() throws Exception {

        List<Producto> productos = new ArrayList();

        try {
            String sql = "SELECT nombre, precio FROM producto";

            consultarBase(sql);
            System.out.println(resultado.toString());

            while (resultado.next()) {

                Producto producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));

                productos.add(producto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return productos;
    }

    public List<Producto> precioEntre120_202() throws Exception {

        List<Producto> productos = new ArrayList();

        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN 120 AND 202";

            consultarBase(sql);

            while (resultado.next()) {

                Producto producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));

                productos.add(producto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return productos;
    }

    public List<Producto> portatil() throws Exception {

        List<Producto> productos = new ArrayList();

        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE \"%portatil%\";";

            consultarBase(sql);

            while (resultado.next()) {
                Producto producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return productos;
    }

    public Producto masBarato() throws Exception {
        Producto p = new Producto();

        try {
            String sql = "SELECT *FROM producto WHERE precio = (SELECT MIN(precio) FROM producto)";
            consultarBase(sql);

            while (resultado.next()) {
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

        return p;
    }

    public void crearProducto(Producto p) throws Exception {
        try {
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES ( '" + p.getCodigo() + "' ,'" + p.getNombre() + "' ,'"
                    + p.getPrecio() + "' ,'" + p.getCodigoFabricante() + "' )";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
