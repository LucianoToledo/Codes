package Ej6.servicios;

import Ej6.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    private Scanner input;
    private HashMap<String, Float> productos;

    public ProductoServicio() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap<>();
    }

    
    public Producto crearProducto() {
        System.out.println("Ingrese nombre del producto");
        String nom = input.next();
        System.out.println("Ingrese precio de " + nom);
        float pre = input.nextFloat();
        return new Producto(nom, pre);
    }

    public void agregarProductos(Producto p) {
        productos.put(p.getNombre(), p.getPrecio());
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println("Producto: " + key + "||   precio: " + value);
        }
    }

    public void eliminarProduto(String p) {
        productos.remove(p);
        System.out.println("Producto eliminado");
    }

    public void modificarPrecio(String nom) {
        Float newPrecio;
        boolean band = false;
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            if (key.equals(nom)) {
                System.out.println("Ingrese nuevo precio");
                newPrecio = input.nextFloat();
                productos.put(key, newPrecio);
                band=true;
            }
        }
        if(!band){
            System.out.println("No se encontro el producto");
        }else{
            System.out.println("Precio modificado correctamente");
        }
    }

}
