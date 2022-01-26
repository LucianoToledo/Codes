package estancia.persistencia;

import estancia.entidades.Casa;
import estancia.entidades.Cliente;
import estancia.entidades.Estancia;
import java.util.ArrayList;
import java.util.List;

public class EstanciaDAO extends DAO {
    //e) Listar los datos de todos los clientes que en algún momento realizaron una estancia
    //y la descripción de la casa donde la realizaron.

    public List<Estancia> listarClientes() throws Exception {

        List<Estancia> clientes = new ArrayList();

        try {
            consultarBase("SELECT e.*, c.* FROM estancias e, clientes c WHERE e.id_cliente = c.id_cliente;");

            System.out.println(resultado.next());

            while (resultado.next()) {
                Estancia e = new Estancia();
                Cliente cli = new Cliente();
                Casa ca = new Casa();

                e.setId_estancia(resultado.getInt("id_estancia"));
                cli.setId_cliente(resultado.getInt("id_cliente"));
                ca.setId_casa(resultado.getInt("id_casa"));
                e.setNombre_huesped(resultado.getString("nombre_huesped"));
                e.setFecha_desde(resultado.getDate("fecha_desde"));
                e.setFecha_hasta(resultado.getDate("fecha_hasta"));
                cli.setNombre(resultado.getString("nombre"));
                cli.setCalle(resultado.getString("calle"));
                cli.setNumero(resultado.getInt("numero"));
                cli.setCodigo_postal(resultado.getString("codigo_postal"));
                cli.setCiudad(resultado.getString("ciudad"));
                cli.setPais(resultado.getString("pais"));
                cli.setEmail(resultado.getString("email"));

                clientes.add(e);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return clientes;
    }
}
