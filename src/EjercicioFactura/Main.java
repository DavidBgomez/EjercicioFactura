package EjercicioFactura;

import java.time.ZonedDateTime;
import java.util.Scanner;

import static EjercicioFactura.GestionadorArticulo.*;

import static EjercicioFactura.GestionadorCliente.*;
public class Main {


    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cedula del cliente: ");
        int cedCliente = Integer.parseInt(teclado.nextLine());

        boolean continuar = false;
        double totalArticulo = 0;
        double totalCompra = 0;
        int CantArticulosComprados = 0;

        if (buscarClienteExiste(cedCliente)){
            continuar =true;
            if (continuar == true) {
                boolean continuar1 = true;
                do {
                    System.out.print("Ingrese el nombre del Articulo: ");
                    String nomArticulo = new String(teclado.nextLine());
                    if (buscarArticuloExistente(nomArticulo) == false) {
                        System.out.print("ingrese la cantidad de este articulo: ");
                        int cantArticulo = Integer.parseInt(teclado.nextLine());
                        totalArticulo = (cantArticulo * traerPrecioProducto(nomArticulo));
                        totalCompra = (totalCompra + totalArticulo);
                        CantArticulosComprados = CantArticulosComprados + cantArticulo;


                        System.out.println("Si desea comprar un nuevo articulo marque 1, de lo contrario marque 0");
                        int artNuevo = Integer.parseInt(teclado.nextLine());
                        if (artNuevo == 0) {
                            System.out.println(ZonedDateTime.now());
                            traerInfoCliente(cedCliente);
                            System.out.println("Tu compra fue: " + nomArticulo);
                            System.out.println("Cantidad del producto: " + CantArticulosComprados);
                            System.out.println("Total de la compra: " + totalCompra);
                            System.out.println("Gracias por su compra");
                            continuar1 = false;
                            System.exit(0);
                        }

                        if (artNuevo == 1) {
                            continuar1 = true;
                        }

                    }
                    if (buscarArticuloExistente(nomArticulo) == true ) {
                        System.out.println("Articulo no existe");
                        continuar = false;
                    }
                }  while (continuar1 == true);
            }
        } if (buscarClienteExiste(cedCliente)==false){
            System.out.println("Cliente no existe");
            System.out.println("Si desea agregar un nuevo cliente marque 1");
            System.out.println("Si desea intentar nuevamente marque 2");
            System.out.println("Si desea salir marque 0");
            int opciones = Integer.parseInt(teclado.nextLine());

            if (opciones == 1){
                System.out.println("Ingrese el nombre del nuevo cliente: ");
                String nomClienteNuevo = new String(teclado.nextLine());
                System.out.print("Ingrese la cedula del nuevo cliente: ");
                int cedClienteNuevo = Integer.parseInt(teclado.nextLine());
                GestionadorCliente.ingresarClienteNuevo(nomClienteNuevo, cedClienteNuevo);
            }

            if (opciones == 2){
                continuar = false;
            }

            if (opciones == 0){
                System.out.println("Gracias por visitarnos");
                System.exit(0);
            }
        }
    }
}


