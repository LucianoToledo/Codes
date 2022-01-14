package Ej2.entidades;

public final class Lavadora extends Electrodomestico {

    private Float carga;

    public Lavadora(Float carga, String color, String consumoEnergetico, Float peso, Double precio) {
        super(color, consumoEnergetico, peso, precio);
        this.carga = carga;
    }

    public Lavadora() {
        super();
    }

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        System.out.println("crear lavadora");

        super.crearElectrodomestico();

        System.out.println("Ingrese carga de la lavadora");
        carga = input.nextFloat();
   
        return new Lavadora(carga, color, consumoEnergetico, peso, precio);
    }

    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            System.out.println("La carga es mayor a 30kg");
            precio += 500.0;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga=" + carga + '}';
    }

}
