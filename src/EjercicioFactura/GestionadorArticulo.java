package EjercicioFactura;

import java.util.ArrayList;

public class GestionadorArticulo {


    public static Boolean buscarArticuloExistente(String nombreArtiuclo){
        boolean articuloEncontrado = false;
        int i = 0;
        ArrayList<Articulo> articulos = getArticulo();
        while (articuloEncontrado == false && i < articulos.size()){
            Articulo articulo = articulos.get(i);
            articuloEncontrado = true;
            if (articulo.getNombreArticulo() == nombreArtiuclo){
                if (articuloEncontrado == true){
                    System.out.println("El precio unitario del articulo es: " + articulo.getNombreArticulo());

                    return true;
                }
            } else{
                i++;
                articuloEncontrado = false;
            }
        }

        return false;
    }

    public static double traerPrecioProducto(String nombreArticulo) {
        ArrayList<Articulo> articulos = getArticulo();
        for (int i = 0; i < articulos.size(); i++) {
            Articulo articulo1 = articulos.get(i);
            if (articulo1.getNombreArticulo().equalsIgnoreCase(nombreArticulo)){
                return articulo1.getPrecioUnitarioArticulo();
            }
        }
        return 0;
    }

    public static ArrayList<Articulo> getArticulo () {
        ArrayList<Articulo> listaDeArticulo = new ArrayList<Articulo>();

        listaDeArticulo.add(new Articulo("Jeans", 231256, 34.000));
        listaDeArticulo.add(new Articulo("Camisas", 678923, 20.000));
        listaDeArticulo.add(new Articulo("Zapatos", 908763, 97.000));
        listaDeArticulo.add(new Articulo("Gorras", 145890, 15.000));

        return listaDeArticulo;

    }
}
