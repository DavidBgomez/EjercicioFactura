package EjercicioFactura;

public class Cliente {

    private String nombreCliente;
    private int numeroDocumentoCliente;

    public Cliente(String nombreCliente, int numeroDocumentoCliente) {
        this.nombreCliente = nombreCliente;
        this.numeroDocumentoCliente= numeroDocumentoCliente;
    }

    public String getNombreCliente() {

        return nombreCliente;
    }

    public int getNumeroDocumentoCliente() {

        return numeroDocumentoCliente;
    }
}
