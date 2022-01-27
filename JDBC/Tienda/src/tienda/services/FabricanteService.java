package tienda.services;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {

    private final FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    //g) Ingresar un fabricante a la base de datos
    public void ingresarFabricante(int codigo, String nombre) throws Exception {
        validarFabricante(codigo, nombre);

        Fabricante fabricante = new Fabricante();

        fabricante.setCodigo(codigo);
        fabricante.setNombre(nombre);

        dao.ingresarFabricante(fabricante);
    }

    private void validarFabricante(int codigo, String nombre) throws Exception {

        if (codigo == 0) {
            throw new Exception("Debe indicar la clave");
        }

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("Debe indicar el nombre");
        }

    }

    //h) Editar un producto con datos a elección  -  Voy a editar el nombre del producto Genius porque cuando lo ingresé me quedó con un espacio
    public void modificarFabricante(int codigo, String nombre) throws Exception {
        Fabricante fabricante = new Fabricante();

        fabricante.setCodigo(codigo);
        fabricante.setNombre(nombre);

        dao.modificarFabricante(fabricante);
    }

    public Fabricante buscarPorCodigo(int cod) throws Exception {
        Fabricante f = new Fabricante();

        f = dao.buscarPorCodigo(cod);

        return f;

    }

    public void mostrarBuscarPorCodigo(int cod) throws Exception {

        Fabricante f = buscarPorCodigo(cod);

        System.out.println(f);
    }

}
