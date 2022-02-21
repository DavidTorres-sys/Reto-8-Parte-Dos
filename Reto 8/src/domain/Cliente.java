
package domain;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    
  //ATRIBUTOS
  private String nombreCliente;
  private String paisCliente;
  private int cedula;
  private int numeroLocalizar;
  private ArrayList<Articulo> articulo;

  //CONSTRUCTOR
  public Cliente(String nombreCliente, String paisCliente, int cedula, int numeroLocalizar) {
    this.nombreCliente = nombreCliente;
    this.paisCliente = paisCliente;
    this.cedula = cedula;
    this.numeroLocalizar = numeroLocalizar;
    //this.articulo = articulo;
  }
  Scanner entrada = new Scanner(System.in);

  
  //MÉTODOS
  public void agregarClientes(long l, ArrayList<Cliente> ClienteCuenta) {
    System.out.print("Ingrese el Nombre del Cliente: ");
    entrada.nextLine();
    String nombreCliente = entrada.nextLine();

    System.out.print("Ingrese el Pais del Cliente: ");
    String paisCliente = entrada.nextLine();

    System.out.print("Ingrese la Cedula del Cliente: ");
    int cedula = entrada.nextInt();

    System.out.print("Ingrese el Numero Localizador del Cliente: ");
    int numeroLocalizar = entrada.nextInt();
    ClienteCuenta.add(new Cliente(nombreCliente, paisCliente, cedula, numeroLocalizar));
    }

  public void verDatosClientes(long i, ArrayList<Cliente> datosCliente) {
    boolean encontrado = false;
    for ( int j = 0; j < datosCliente.size(); j++){
      if( i == datosCliente.get(j).getCedula()){
        System.out.println(datosCliente.get(j).getCedula());
        encontrado = true;
      }
    }
    if(encontrado == false){
      System.out.println("Su Cedula "+ i + " no está registrada en nuestra plataforma!");
    }
  }

  
  public ArrayList<Articulo> getArticulo() {
    return articulo;
  }

  //GET AND SET
  public void setArticulo(ArrayList<Articulo> articulo) {
    this.articulo = articulo;
  }

  public String getNombreCliente() {
    return nombreCliente;
  }

  public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
  }

  public String getPaisCliente() {
    return paisCliente;
  }

  public void setPaisCliente(String paisCliente) {
    this.paisCliente = paisCliente;
  }

  public int getCedula() {
    return cedula;
  }

  public void setCedula(int cedula) {
    this.cedula = cedula;
  }

  public int getNumeroLocalizar() {
    return numeroLocalizar;
  }

  public void setNumeroLocalizar(int numeroLocalizar) {
    this.numeroLocalizar = numeroLocalizar;
  }
  
  //TO STRING
@Override
  public String toString() {
    return "Cliente{" +
        "nombreCliente='" + nombreCliente + '\'' +
        ", paisCliente='" + paisCliente + '\'' +
        ", cedula=" + cedula +
        ", numeroLocalizar=" + numeroLocalizar +
        '}';
  }
  
}

