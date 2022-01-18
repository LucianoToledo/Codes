package tienda;

import tienda.services.ProductoService;

public class Tienda {

    public static void main(String[] args) {

        ProductoService productoService = new ProductoService();

        try {
            productoService.mostrarTodos();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

}
