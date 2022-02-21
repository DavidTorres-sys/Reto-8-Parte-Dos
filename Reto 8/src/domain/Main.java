
package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    int opcion;
    int opcionAgregar;
    int AgregarArticulos;

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    ArrayList<Banco> listaCuentas = new ArrayList<Banco>();

    Articulo articulo = new Articulo(0, "", "");
    Cliente cliente = new Cliente("","", 0, 0);
    Banco banco = new Banco("Inicia");

    Scanner entrada = new Scanner(System.in);
      do {
        System.out.println("1. Agregar/Quitar Clientes");
        System.out.println("2. Agregar/Quitar Articulos");
        System.out.println("3. Ver Datos Clientes");
        System.out.println("4. Ver el Valor Estimado de su Cuenta");
        System.out.println("5. Ver Datos del Banco");

        System.out.print("Ingrese una Opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
          case 1:
            do {
              System.out.println("1. Agregar Clientes");
              System.out.println("2. Quitar Clientes");
              System.out.println("3. Consultar Clientes");
              System.out.print("Ingrese una Opcion: ");
              opcionAgregar = entrada.nextInt();
              switch (opcionAgregar) {
                case 1:
                  System.out.println("Clientes (Presione Enter para continuar)");
                  cliente.agregarClientes(entrada.nextLong(), clientes);
                  System.out.println(cliente);
                  break;
                case 2:
                  System.out.println("Ingrese el número de cuenta que desea eliminar");
                  banco.eliminarCuenta(entrada.nextLong(), listaCuentas);
                  break;
                case 3:
                  System.out.println("Ingrese la clave de su cuenta para consultar sus datos");
                  banco.consultarCuenta(entrada.nextLong(), listaCuentas);
                break;
              }
              System.out.println(clientes);
              break;
            } while (opcionAgregar < 1 || opcionAgregar > 2);
          case 2:
            do {
              System.out.println("1. Agregar Articulos");
              System.out.println("2. Quitar Articulos");
              System.out.print("Ingrese una Opcion: ");
              AgregarArticulos = entrada.nextInt();
              switch (AgregarArticulos) {
                case 1 -> {
                  System.out.println("Articulos (Presione 1 para continuar)");
                  articulo.agregarArticulo(entrada.nextLong(), articulos);
                  System.out.println(articulos);
                }
                case 2 -> {
                  System.out.print("Ingrese el nombre del articulo a eliminar: ");
                  articulo.eliminarArticulo(entrada.nextLine(), articulos);
                }
              }
              break;
            } while (AgregarArticulos < 1 || AgregarArticulos > 2);
          case 3:
            System.out.print("Numero de cedula: ");
            cliente.verDatosClientes(entrada.nextInt(), clientes);
            break;
          case 4:
            articulo.valorEstimadoCuenta();
            break;
        }
      } while (opcion <= 1 || opcion >= 5);
  }
}
