
package Ej3Extra.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Cuota {
    private int numCuota;
    private Double montoTotalCuota;
    private boolean paga;
    private Date fechaVencimiento;
    private TipoPago tipoPago;
    private ArrayList<Poliza> polizas;

    public Cuota(int numCuota, Double montoTotalCuota, boolean paga, Date fechaVencimiento, TipoPago tipoPago, ArrayList<Poliza> polizas) {
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.paga = paga;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoPago = tipoPago;
        this.polizas = polizas;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public Double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numCuota=" + numCuota + ", montoTotalCuota=" + montoTotalCuota + ", paga=" + paga + ", fechaVencimiento=" + fechaVencimiento + ", tipoPago=" + tipoPago + ", polizas=" + polizas + '}';
    }
    
    
}
