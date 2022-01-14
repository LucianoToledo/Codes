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
package Ej5Servicios;

import Ej5.entidades.CuentaEj5;
import java.util.Scanner;

public class CuentaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public CuentaEj5 crearCuenta() {

        System.out.println("Ingrese numero de cuenta");
        int nroCta = input.nextInt();
        System.out.println("Ingrese DNI del usuario");
        long dni = input.nextLong();
        double saldoIni = 10000; //lo declaro como saldo inicial

        return new CuentaEj5(nroCta, dni, saldoIni);
    }

    public void ingresar(double ingreso, CuentaEj5 cuenta) {

        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
        System.out.println("Dinero ingresado $" + ingreso + "\n"
                + "Saldo actual $" + cuenta.getSaldo());
    }

    public void retirar(CuentaEj5 cuenta, double saldoRetirar) {

        if (cuenta.getSaldo() >= saldoRetirar) {
            cuenta.setSaldo(cuenta.getSaldo() - saldoRetirar);
            System.out.println("Usted a retirado $" + saldoRetirar + "\n"
                    + "Saldo Restante $" + cuenta.getSaldo());
        } else {
            System.out.println("Error \n"
                    + "Saldo disponible $" + cuenta.getSaldo());
        }
    }

    public void extracionRapida(CuentaEj5 cuenta, double saldoRetirar) {

        if (cuenta.getSaldo() * 0.2 >= saldoRetirar) {
            cuenta.setSaldo(cuenta.getSaldo() - saldoRetirar);
            System.out.println("Usted a retirado $" + saldoRetirar + "\n"
                    + "Saldo Restante $" + cuenta.getSaldo());
        } else {
            System.out.println("Error \n"
                    + "Saldo disponible $" + cuenta.getSaldo() + "\n"
                    + "Saldo disponible para retirar $" + cuenta.getSaldo() * 0.2);
        }
    }

    public void consultarSaldo(CuentaEj5 cuenta) {
        System.out.println("Saldo: $" + cuenta.getSaldo());
    }

    public void consultarDatos(CuentaEj5 cuenta) {
        System.out.println("Nro Cuenta " + cuenta.getNumeroCuenta() + "\n"
                + "DNI: " + cuenta.getDNI() + "\n"
                + "Saldo: $" + cuenta.getSaldo());
    }
}
