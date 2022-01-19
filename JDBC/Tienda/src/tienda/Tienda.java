package tienda;

import tienda.services.ProductoService;
import tienda.services.FabricanteService;

public class Tienda {

    public static void main(String[] args) {

        ProductoService productoService = new ProductoService();
        
        FabricanteService fabricanteService = new FabricanteService();

        try {
            //productoService.mostrarTodos();
            
            //productoService.mostrarNombrePrecio();
            
            // productoService.MostrarPrecioEntre120_202();
            
            //productoService.MostrarPortatil();
            
            //productoService.mostrarMasBarato();
            
           // productoService.crearProducto(123, "Parlante Genius", 10000.0, 3);
           
            //fabricanteService.ingresarFabricante(12, " Genius");
            
            fabricanteService.modificarFabricante(12, "Genius");
        
            
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

}
