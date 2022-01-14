/*8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
•
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
•
Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
•
Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
•
Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
•
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
•
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
•
Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package Ej8.servicio;

import Ej8.entidades.Cadena;

public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String temp = cadena.getFrase().toUpperCase();
            if ("A".equals(temp.substring(i, i + 1)) || "E".equals(temp.substring(i, i + 1)) || "I".equals(temp.substring(i, i + 1)) || "O".equals(temp.substring(i, i + 1)) || "U".equals(temp.substring(i, i + 1))) {
                cont++;
            }
        }
        System.out.println("La frase " + cadena.getFrase() + ", contiene " + cont + " vocales" + "\n"
                + "");
        System.out.println("------------");
    }

    public void invertirFrase(Cadena cadena) {
        String cadenaInvertida = cadena.getFrase();

        StringBuilder strb = new StringBuilder(cadenaInvertida);
        cadenaInvertida = strb.reverse().toString();
        System.out.println("Frase Invertida: " + cadenaInvertida + "\n"
                + "");
        System.out.println("------------");
    }

    public void vecesRepetido(String letra, Cadena cadena) {
        int cont = 0;
        letra = letra.toUpperCase();
        String temp = cadena.getFrase().toUpperCase();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if ((temp.substring(i, i + 1).equals(letra))) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + cont + " veces en la frase " + cadena.getFrase() + "\n"
                + "");
        System.out.println("------------");
    }

    public void compararLongitud(String frase, Cadena cadena) {
        int lg = frase.length();

        if (lg == cadena.getLongitud()) {
            System.out.println("Las frases tienen las misma longitud \n"
                    + "Longitud " + lg + "\n"
                    + "");
        } else {
            System.out.println("Las frases tienen diferente longitud \n"
                    + "\n"
                    + cadena.getFrase() + ", tiene longigud " + cadena.getLongitud() + "\n"
                    + frase + ", tiene longigud " + lg + "\n"
                    + "");
        }
        System.out.println("------------");
    }

    public void unirFrases(String frase, Cadena cadena) {
        String temp = cadena.getFrase() + frase;
        System.out.println("Frase unida: " + temp);
        System.out.println("------------");
    }

    public void reemplazar(Cadena cadena, String frase4) {
        String carReem = cadena.getFrase().replace("a", frase4);
        System.out.println("Frase con el caracter reemplazado: " + carReem);
        System.out.println("------------");
    }

    public void contiene(String frase5, Cadena cadena) {
        if (cadena.getFrase().contains(frase5)) {
            System.out.println("La frase contiene el caracter");
        } else {
            System.out.println("La frase NO contiene el caracter");
        }
        System.out.println("------------");
    }

}
