package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practica {

//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
    public Boolean numeroCapicua(Integer num) {

        String temp = "";

        if (num == null) {
            return false;
        } else if (num > -10 & num < 10) {
            return true;
        }

        String aux = Integer.toString(num);

        if (aux.substring(0, 1).equals("-")) {
            aux = aux.substring(1);
        }

        for (int i = aux.length(); i > 0; i--) {
            temp = temp + aux.substring(i - 1, i);
        }

        return aux.equals(temp);

    }

//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int podrido = 23;

        for (int i = inicio; inicio < cantidadLadrones; i++) {
            cantidadCaramelos--;
            if (cantidadLadrones == 1) {
                podrido = inicio;
                break;
            }
            if (cantidadCaramelos == 0) {
                podrido = i;
                break;
            }
            if (i == cantidadLadrones) {
                i = 0;
            }
        }
        return podrido;
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    
    public List<String> mediasAmigas(List<String> pasajeros) {

        ArrayList<String> mediasAmigas = new ArrayList();
        HashSet<String> temp = new HashSet();

        int k;

        for (int i = 0; i < pasajeros.size(); i++) {
            k = 0;
            for (int j = 0; j < pasajeros.size(); j++) {
                if (pasajeros.get(i).equals(pasajeros.get(j))) {
                    k++;
                }
            }
            if (k >= 2) {
                temp.add(pasajeros.get(i));
            }
        }

        for (String aux : temp) {
            mediasAmigas.add(aux);
        }

        return mediasAmigas;
    }
}
