package estancia;

import estancia.services.CasaService;
import estancia.services.EstanciaService;
import estancia.services.FamiliaService;
import java.util.Scanner;

public class EstanciaMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        FamiliaService familiaService = new FamiliaService();
        CasaService casaService = new CasaService();
        EstanciaService estanciaService = new EstanciaService();

        try {
            //familiaService.mostrarFamilia();
            //casaService.mostrarCasas();
            // familiaService.mostrarFamiliaHotmail();
            String fechaDesde;
            int dias;

//            System.out.println("Ingrese fecha Desde aaaa-mm-dd");
//            fechaDesde = input.next();
//            System.out.println("Ingrese cantidad de dias");
//            dias = input.nextInt();
//            casaService.mostrarCasasPorFechaIngresada(fechaDesde, dias);

            //estanciaService.mostrarClientes();
            
            casaService.mostrarNumCasasPorPais();

        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

}
