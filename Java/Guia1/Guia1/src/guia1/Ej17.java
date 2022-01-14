//17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
//tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
//con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
//carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la
//secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
//secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
//se utilizan las siguientes funciones de Java Substring(), Length(), equals().
package guia1;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int correctas = 0;
        int incorrectas = 0;
        int lg;
        String pal;
        boolean band = true;

        do {
            System.out.println("Ingrese palabra");
            pal = leer.next();
            lg = pal.length();

            if (pal.equals("&&&&&")) {
                band = false;
            } else if (lg <= 5 && ("x".equals(pal.substring(0, 1))) && ("o".equals(pal.substring(lg - 1, lg)))) {
                correctas++;
            } else {
                System.out.println("La palabra debe tener como max 5 caracteres");
                incorrectas++;
            }

        } while (band != false); 

        System.out.println("Palabras Correctas -->" + correctas);
        System.out.println("Palabras Incorrectas -->" + incorrectas);
    }
}
//            if (lg <= 5 && ("x".equals(pal.substring(0, 1))) && ("o".equals(pal.substring(lg - 1, lg)))) {
//                correctas++;
//            } else {
//                if (pal.equals("&&&&&")) {
////                band = false;
//                    break;
//                }
//                incorrectas++;
//                System.out.println("La palabra debe tener como max 5 caracteres");
//            }
//        } while (band != false); //no sirve para nada pero tengo que poner algo
//        
