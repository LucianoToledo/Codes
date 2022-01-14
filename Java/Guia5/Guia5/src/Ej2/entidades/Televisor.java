package Ej2.entidades;

public final class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, Double precio, String color, String consumoEnergetico, Float peso) {
        super(color, consumoEnergetico, peso, precio);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor crearTelevisor() {
        System.out.println("Crear tv");

        super.crearElectrodomestico();;

        System.out.println("Ingrese resolucion");
        resolucion = input.nextInt();

        System.out.println("Es sintonizadorTDT?");
        sintonizadorTDT = input.nextBoolean();

        return new Televisor(resolucion, sintonizadorTDT, precio, color, consumoEnergetico, peso);
    }

    public void precioFinal() {
        super.precioFinal();
        if (sintonizadorTDT == true) {
            precio += 500.0;
            System.out.println("tiene sintonizador");
        }
        if (resolucion > 40) {
            precio += precio * 0.3;
            System.out.println("la tv tiene mas de 40 pulgadas");
        } else {
            System.out.println("la tv tiene MENOS de 40pulgas");
        }
    }

    @Override
    public String toString() {

        return "Televisor{" + super.toString() + " resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
}
