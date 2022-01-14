package Ej2.entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Float peso;
    protected static Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String consumoEnergetico, Float peso, Double precio) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    private String comprobarConsumoEnergetico(String l) {
        boolean bol = false;
        for (ConsumoEnum value : ConsumoEnum.values()) {
            if (value.toString().equalsIgnoreCase(l)) {
                bol = true;
                System.out.println("aaaa");
                break;
            }
        }
        if (!bol) {
            System.out.println("bbbbbb");
            return "F";
        }
        return l.toUpperCase();
    }

    private String comprobarColor(String color) {
        String c = null;
        boolean bol = false;
        for (ColorEnum value : ColorEnum.values()) {
            if (value.toString().equalsIgnoreCase(color)) {
                bol = true;
                c = value.toString();
                break;
            }
        }
        if (!bol) {
            c = ColorEnum.BLANCO.toString();
        }
        return c;
    }

//    public String comprobarColor(String color) {
//        String c = null;
//        for (ColorEnum value : ColorEnum.values()) {
//            //!value.toString().equalsIgnoreCase(color)
//            if (!color.equalsIgnoreCase(value.toString())) {
//                c = ColorEnum.BLANCO.toString();
//            } else {
//                c = value.toString();
//            }
//        }
//        return c;
//    }
//    public void comprobarColor(String color) {
//        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
//
//        if (!Arrays.toString(colores).contains(color.toLowerCase())) {
//            this.color = "blanco";
//        }
//
//    }
    public void crearElectrodomestico() {

        precio = 1000.0;
        System.out.println("Ingrese Color");
        String colorIngresado = input.next();

        color = comprobarColor(colorIngresado);

        System.out.println("Ingrese Consumo");
        String c = input.next();
        consumoEnergetico = comprobarConsumoEnergetico(c); //agregar las cosas del enum

        System.out.println("Ingrese peso");
        Float p = input.nextFloat();
        if (p >= 0) {
            peso = p;
        }

    }

    public void precioFinal() {

        switch (consumoEnergetico) {
            case "A":
                precio += 1000.0;
                break;
            case "B":
                precio += 800.0;
                break;
            case "C":
                precio += 600.0;
                break;
            case "D":
                precio += 500.0;
                break;
            case "E":
                precio += 300.0;
                break;
            case "F":
                precio += 100.0;
                break;
        }
        if (peso > 0 && peso <= 19) {
            precio += 100.0;
        } else if (peso > 19 && peso <= 49) {
            precio += 500.0;
        } else if (peso > 49 && peso <= 79) {
            precio += 800.0;
        } else {
            precio += 1000.0;
        }
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }

}
