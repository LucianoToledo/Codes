package tienda.services;

import com.sun.org.apache.bcel.internal.generic.F2D;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    private final ProductoDAO dao;
    private final FabricanteService fabricanteServicio;

    public ProductoService() {
        this.dao = new ProductoDAO();
        fabricanteServicio = new FabricanteService();
    }

    //a) Lista el nombre de todos los productos que hay en la tabla producto
    public List<Producto> listarTodos() throws Exception {
        List<Producto> productos = dao.listarTodos();
        return productos;
    }

    public void mostrarTodos() throws Exception {
        List<Producto> productos = listarTodos();

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    //b) Lista los nombres y los precios de todos los productos de la tabla producto.
    private List<Producto> seleccionarNombrePrecio() throws Exception {
        List<Producto> productos = dao.seleccionarNombrePrecio();
        return productos;
    }

    public void mostrarNombrePrecio() throws Exception {
        List<Producto> productos = seleccionarNombrePrecio();

        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + "   -   " + producto.getPrecio());
            System.out.println(producto); //al ser un objeto va a mostrar todos los atributos
        }
    }

    //c) Listar aquellos productos que su precio esté entre 120 y 202
    private List<Producto> precioEntre120_202() throws Exception {
        List<Producto> productos = dao.precioEntre120_202();
        return productos;
    }

    public void MostrarPrecioEntre120_202() throws Exception {
        List<Producto> productos = precioEntre120_202();

        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + "   -             " + producto.getPrecio());
            //System.out.println(producto); //al ser un objeto va a mostrar todos los atributos
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto.
    private List<Producto> portatil() throws Exception {
        List<Producto> productos = dao.portatil();
        return productos;
    }

    public void MostrarPortatil() throws Exception {
        List<Producto> productos = portatil();

        for (Producto producto : productos) {
           // System.out.println(producto.getNombre() + "   -             " + producto.getPrecio());
            System.out.println(producto); //al ser un objeto va a mostrar todos los atributos
        }
        
    }

    //e) Listar el nombre y el precio del producto más barato.
    private Producto masBarato() throws Exception {
        Producto p = dao.masBarato();
        return p;
    }

    public void mostrarMasBarato() throws Exception {
        Producto p = masBarato();
        System.out.println(p);
    }

    //) Ingresar un producto a la base de datos.
    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

        validar(codigo, nombre, precio, codigoFabricante);

        Fabricante f = fabricanteServicio.buscarPorCodigo(codigoFabricante); //hacer el metodo en fabricante servicio
        Producto producto = new Producto(codigo, nombre, precio, f);

        dao.crearProducto(producto);
    }

    private void validar(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

        if (codigo == 0) {
            throw new Exception("Debe indicar el codigo");
        }

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("Debe indicar el nombre");
        }

        if (precio == 0.0) {
            throw new Exception("Debe indicar el precio");
        }

        if (codigoFabricante <= 0) {
            throw new Exception("Cod fabricante incorrecto");
        }

    }

}
