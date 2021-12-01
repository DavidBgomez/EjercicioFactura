package EjercicioFactura;

import java.util.ArrayList;

public class GestionadorCliente {

    public Object cliente;

    public static Boolean buscarClienteExiste(int numeroDocumentoCliente) {
        boolean clienteEncontrado = false;
        int i = 0;
        ArrayList<Cliente> clientes = getCliente();
        while (clienteEncontrado == false && i < clientes.size()) {
            Cliente cliente = clientes.get(i);
            clienteEncontrado = true;
            if (cliente.getNumeroDocumentoCliente() == numeroDocumentoCliente) {
                if (clienteEncontrado == true){
                    System.out.println("Nombre del cliente: " + cliente.getNombreCliente());
                    return true;
                }

            } else {
                i++;
                clienteEncontrado = false;
            }
        }

        return false;
    }

    public static Boolean traerInfoCliente(int numeroDocumentoCliente) {
        boolean clienteEncontrado = false;
        int i = 0;
        ArrayList<Cliente> clientes = getCliente();
        while (clienteEncontrado == false && i < clientes.size()) {
            Cliente cliente = clientes.get(i);
            if (cliente.getNumeroDocumentoCliente() == numeroDocumentoCliente) {
                if (clienteEncontrado == false) {
                    System.out.println("Nombre del cliente: " + cliente.getNombreCliente());
                    System.out.println("Numero de documento del cliente es: " + cliente.getNumeroDocumentoCliente());

                    return true;
                }
            } else {
                i++;
                clienteEncontrado = false;
            }
        }

        return false;
    }

    public static void ingresarClienteNuevo(String nombreClienteNuevo, int cedClienteNuevo){
        ArrayList<Cliente> clientes = getCliente();
        clientes.add(new Cliente(nombreClienteNuevo,cedClienteNuevo));
    }

    public static ArrayList<Cliente> getCliente () {
        ArrayList<Cliente> listaDeCliente = new ArrayList<Cliente>();

        listaDeCliente.add(new Cliente("Diego Gomez", 189345));
        listaDeCliente.add(new Cliente("Laura Garcia", 456782));
        listaDeCliente.add(new Cliente("Alejandro Monsalve", 545267));
        listaDeCliente.add(new Cliente("Tatiana Barrera", 123456));
        listaDeCliente.add(new Cliente("Jorge Medina", 332156));

        return listaDeCliente;

    }
}
