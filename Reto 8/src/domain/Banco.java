
package domain;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Banco {

  //ATRIBUTOS
  private String nombre;
  private int cedula;
  private long numeroCuenta;
  private int claveCuenta;
  private String paisTitular;
  private String tipoDocumento;


  Scanner entrada = new Scanner(System.in);

  //CONSTRUCTOR

  public Banco( String iniciar){
  }
  public void busquedaCliente() {
    Hashtable<Integer, Cliente> hashCliente = new Hashtable<>();
    System.out.print("Ingrese su clave: ");
    int busqueda = entrada.nextInt();
    hashCliente.get(busqueda);
  }
  //CREAR CUENTA

  public Banco(){
  }

  //CONSULTAR CUENTA
  public void consultarCuenta(long i, ArrayList<Banco> listaCuentas) {
    boolean encontrado = false;
    for ( int j = 0; j < listaCuentas.size(); j++){
      if( i == listaCuentas.get(j).getNumeroCuenta()){
        System.out.println("Numero de Cuenta:");
        System.out.println(listaCuentas.get(j).getNumeroCuenta());
       // System.out.println(listaCuentas.get(j).getSaldoDisponible());
        encontrado = true;
      }
    }

    if(encontrado == false){
      System.out.println("Su número de cuenta "+ i + " no está registrada en nuestra plataforma!");

    }
  }

  //ELIMINAR CUENTA
  public void eliminarCuenta(long i, ArrayList<Banco> listaCuentas) {

    boolean encontrado = false;
    for ( int j = 0; j < listaCuentas.size(); j++){
      if( i == listaCuentas.get(j).getNumeroCuenta()){
        listaCuentas.remove(j);
        encontrado = true;
        System.out.println("La cuenta con número " + i + " fue eliminada de nuestra plataforma!");
      }
    }
    if(!encontrado){
      System.out.println("La cuenta " + i + " no se pudo eliminar porque no está en nuestra plataforma!");
    }
  }

  //GET AND SET

  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(){
    System.out.println("Ingresar el nombre del titular de la cuenta");
    nombre = entrada.nextLine();
  }

  public int getCedula(){
    return this.cedula;
  }
  public void setCedula(){
    System.out.println("Ingresar el número de cédula del titular de la cuenta");
    cedula = entrada.nextInt();
  }

  public long getNumeroCuenta(){
    return this.numeroCuenta;
  }
  public void setNumeroCuenta(){
    System.out.println("Ingresar el número de cuenta de su banco");
    numeroCuenta = entrada.nextInt();
  }

  public int getClaveCuenta(){
    return this.claveCuenta;
  }
  public void setClaveCuenta(){
    System.out.println("Ingresar la clave de su cuenta");
    claveCuenta = entrada.nextInt();
  }

  public String getPaisTitular(){
    return this.paisTitular;
  }
  public void setPaisTitular(){
    System.out.println("Ingresar país de residencia del titular de la tarjeta");
    paisTitular = entrada.nextLine();
  }

  public String getTipoDocumento(){
    return this.tipoDocumento;
  }
  public void setTipoDocumento(){
    System.out.println("Ingresar su tipo de documento");
    tipoDocumento = entrada.next();
    }
    
}
