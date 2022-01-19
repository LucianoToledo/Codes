package estancia;

import estancia.services.CasaService;
import estancia.services.FamiliaService;

public class EstanciaMain {

    public static void main(String[] args) {

        FamiliaService familiaService = new FamiliaService();
        CasaService casaService = new CasaService();

        try {
            //familiaService.mostrarFamilia();
            casaService.mostrarCasas();
        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

}
