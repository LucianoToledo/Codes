/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package Ej6.ppal;

import Ej6.entidades.Producto;
import Ej6.servicios.ProductoServicio;
import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ProductoServicio productoServicio = new ProductoServicio();
        
        int opc;
        String nom;
        do {
            System.out.println("Menu \n"
                    + "1- Ingresar Producto\n"
                    + "2- Modificar Precio\n"
                    + "3- Mostrar Productos\n"
                    + "4- Eliminar Producto \n"
                    + "5- Salir");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    Producto producto = productoServicio.crearProducto();
                    productoServicio.agregarProductos(producto);
                    break;
                case 2:
                    System.out.println("Ingrese producto que desea modificar precio");
                    nom = input.next();
                    productoServicio.modificarPrecio(nom);
                    break;
                case 3:
                    System.out.println("----------");
                    productoServicio.mostrarProductos();
                    System.out.println("----------");
                    break;
                case 4:
                    System.out.println("Ingrese producto que desea modificar precio");
                    nom = input.next();
                    productoServicio.eliminarProduto(nom);
                    break;
                default:
                    if (opc != 5) {
                        System.out.println("Opcion no valida");
                    }
            }
        } while (opc != 5);

    }

}
