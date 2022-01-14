/*21. Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void). 
 
El cambio de divisas es: 
    * 0.86 libras es un 1 € 
    * 1.28611 $ es un 1 € 
    * 129.852 yenes es un 1 € */
package guia1;

import java.util.Scanner;

public class Ej21 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String opc;
        double euro;

        System.out.println("Ingrese cantidad de euros a cambiar");
        euro = leer.nextInt();

        System.out.println("Ingrese moneda deseada: \n"
                + "Dolar \n"
                + "Libra \n"
                + "Yen");
        opc = leer.next();

        divisa(euro, opc);

    }

    public static void divisa(double e, String o) {
        double d, y, l;

        if ("dolar".equals(o)) {
            o = "1";
        } else if ("libra".equals(o)) {
            o = "3";
        } else if ("yen".equals(o)) {
            o = "2";
        } else {
            System.out.println("Opcion no valida");
        }

        switch (o) {
            case "1":
                d = e * 1.28611;
                System.out.println(d + " U$D");
                break;
            case "2":
                y = e * 129.852;
                System.out.println(y + " yenes");
                break;
            case "3":
                l = e * 0.86;
                System.out.println(l + " libras");
                break;
        }
    }
}

//  Scanner leer = new Scanner(System.in).useDelimiter("\n");
//
//        int opc;
//        double euro;
//
//        System.out.println("Ingrese cantidad de euros a cambiar");
//        euro = leer.nextInt();
//
//        System.out.println("Ingrese moneda deseada: \n"
//                + "1- Dolar \n"
//                + "2- Libra \n"
//                + "3-Yen");
//        opc = leer.nextInt();
//
//        switch (opc) {
//            case 1:
//                dolar(euro);
//                break;
//            case 2:
//                libra(euro);
//                break;
//            case 3:
//                yen(euro);
//                break;
//            default:
//                System.out.println("Opcion no valida4");
//        }
//    }
//
//    public static void dolar(double e) {
//        double d;
//        d = e * 1.28611;
//        System.out.println(d + " U$D");
//    }
//
//    public static void libra(double e) {
//        double l;
//        l = e * 0.86;
//        System.out.println(l + " libras");
//    }
//
//    public static void yen(double e) {
//        double y;
//        y = e * 129.852;
//        System.out.println(y + " yenes");
//    }
//}
