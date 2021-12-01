package EjercicioFactura;

public class Articulo {

    private String nombreArticulo;
    private int codigoArticulo;
    private double precioUnitarioArticulo;

    public Articulo(String nombreArticulo, int codigoArticulo, double precioUnitarioArticulo){
        this.nombreArticulo = nombreArticulo;
        this.codigoArticulo = codigoArticulo;
        this. precioUnitarioArticulo = precioUnitarioArticulo;
    }

    public String getNombreArticulo() {

        return nombreArticulo;
    }

    public int getCodigoArticulo(){

        return codigoArticulo;
    }

    public double getPrecioUnitarioArticulo() {

        return precioUnitarioArticulo;
    }

}
