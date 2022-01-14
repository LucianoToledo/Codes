/*5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto.*/
package EJ5;

import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] mes = new String[12];
        
        mes[0]="enero";
        mes[1]="febrero";
        mes[2]="marzo";
        mes[3]="abril";
        mes[4]="mayo";
        mes[5]="junio";
        mes[6]="julio";
        mes[7]="agosto";
        mes[8]="septiembre";
        mes[9]="octubre";
        mes[10]="noviembre";
        mes[11]="diciembre";
        
        String mesSecreto = mes[(int)(Math.random()*12)];
        
        boolean band = true;
        int i=0;
        String opcN;
        
        do{
            if(i==0){
            System.out.println("ADIVINE EL MES");
            }
            i++;
            String opc = input.next().toLowerCase();
            
            if(opc.equals(mesSecreto)){
                System.out.println("Felicidades, has adivinado!!\n"
                        + "\n"
                        + "Desea jugar otra vez?? S/N");
                opcN = input.next().toLowerCase();
                if("s".equals(opcN)){
                    mesSecreto = mes[(int)(Math.random()*12)];
                    i=0;
                    System.out.println("------------");
                }else{
                    System.out.println("ADIOS!!");
                    band = false;
                }
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }
        }while(band);
    }
    
}
