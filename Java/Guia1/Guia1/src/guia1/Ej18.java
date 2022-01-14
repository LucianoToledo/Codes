/*18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo: 
 
0-0-0 
0-0-1 
0-0-2 
0-0-E 
0-0-4 
. 
. 
0-1-2 
0-1-E*/
//Nota: investigar función equals() y como convertir números a String
package guia1;

public class Ej18 {

    public static void main(String[] args) {

        int i = 0, j = 0, k = 0;

        do {

            if (k <= 8) {
                k++;
            } else if (j <= 8) {
                if (k == 9) {
                    k = 0;
                }
                j++;
            } else if (j == 9) {
                j = 0;
                i++;
            }

            if (i == 3 && j == 3 && k == 3) {//kji
                System.out.println("E+E+E");
            }else if (i == 3 && j == 3) {//ji
                System.out.println("E+E+" + k);
            } else if (i == 3 && k == 3) { //ki
                System.out.println("E+" + j + "+E");
            } else if (j == 3 && k == 3) { //kj
                System.out.println(i + "+E+E");
            } else if (i == 3) {
                System.out.println("E+" + j + "+" + k);
            }else if (j == 3) {
                System.out.println(i + "+E+" + k);
            }else  if (k == 3) {
                System.out.println(i + "+" + j + "+E");
            } else{
                System.out.println(i + "+" + j + "+" + k);
            }
            
        } while (i != 9);

    }
}

//CODIGO CRISTIAN (cumple con la consigna)
//public class Ejercicio18 {
//
//    public static void main(String[] args) {
//
//        int i,j,k;
//        String a,b,c;
//
//        for(i=0;i<=9;i++){
//            for(j=0;j<=9;j++){
//                for(k=0;k<=9;k++){
//
//                    a=valueOf(i);
//                    b=valueOf(j);
//                    c=valueOf(k);
//
//                    if (a.equals("3") && b.equals("3") && c.equals("3")){
//                        a= "E";
//                        b="E";
//                        c="E";
//                    }else if (a.equals("3") && b.equals("3")){
//                        b= "E";
//                        a="E";
//                    } else if(a.equals("3") && c.equals("3")){
//                        c= "E";
//                        a="E";
//                    } else if(b.equals("3") && c.equals("3")){
//                        c="E";
//                        b="E";
//                    } else if(a.equals("3")){
//                        a="E";
//                    } else if(b.equals("3")){
//                        b="E";
//                    } else if(c.equals("3")){
//                        c="E";
//                    }
//                    System.out.println(a+"-"+b+"-"+c);
//                }
//            }
//        }
//
//    }
//
//}