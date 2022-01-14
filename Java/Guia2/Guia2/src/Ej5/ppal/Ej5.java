//5. Realizar  una  clase  llamada  Cuenta  (bancaria)  que  debe  tener  como  mínimo  los 
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las 
//operaciones asociadas a dicha clase son:  
// 
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
//• Agregar los métodos getters y setters correspondientes  
//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
//• Método  ingresar(double  ingreso):  el  método  recibe  una  cantidad  de  dinero  a  
//ingresar y se la sumara a saldo actual. 
//• Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y 
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//pondrá el saldo actual en 0.  
//• Método  extraccionRapida():  le  permitirá  sacar  solo  un  20%  de  su  saldo.  Validar 
//que el usuario no saque más del 20%. 
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.  
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
package Ej5.ppal;

import Ej5.entidades.CuentaEj5;
import Ej5Servicios.CuentaServicio;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        CuentaServicio cuenta = new CuentaServicio();
        CuentaEj5 c1 = cuenta.crearCuenta();

        int opc;
        do {
            System.out.println("MENU \n"
                    + "1 - Ingresar Dinero\n"
                    + "2 - Retirar Dinero\n"
                    + "3 - Extraccion Rapida\n"
                    + "4 - Consultar Saldo\n"
                    + "5 - Consultar Datos\n"
                    + "6 - Salir");

            opc = input.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("Ingrese el dinero");
                    double ingreso = input.nextDouble();
                    cuenta.ingresar(ingreso, c1);
                    break;
                case 2:
                    System.out.println("Ingrese cantidad de dinero a retirar");
                    double saldoRetirar = input.nextDouble();
                    cuenta.retirar(c1, saldoRetirar);
                    break;
                case 3:
                    System.out.println("Ingrese cantidad de dinero a retirar");
                    double saldoExtraer = input.nextDouble();

                    cuenta.extracionRapida(c1, saldoExtraer);
                    break;
                case 4:
                    cuenta.consultarSaldo(c1);
                    break;
                case 5:
                    cuenta.consultarDatos(c1);
                    break;
                default:
                    if (opc != 6) {
                        System.out.println("Opcion no valida");
                    }
            }
            System.out.println("------------");
        } while (opc != 6);

    }

}
