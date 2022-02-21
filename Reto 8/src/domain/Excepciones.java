
package domain;

import java.util.ArrayList;

public class  Excepciones extends Exception {
    public Excepciones(String mensaje){
      super(mensaje);
    }

    public static boolean IsInteger(String text){
      long v;
      try{
        v = Long.parseLong(text);
        return true;
      }catch (NumberFormatException ex){
        System.out.println("Error..Ingrese solo Números!!");
        return false;
      }
    }

    public static boolean validarCuenta(long i, ArrayList<Banco> listaCuentas){
      boolean encontrado = false;
      for ( int j = 0; j < listaCuentas.size(); j++){
        if( i == listaCuentas.get(j).getNumeroCuenta()){
          encontrado = true;
        }
      }
      if(encontrado == false){
        System.out.println("El número de cuenta "+ i + " no existe!!");
        return false;

      }else{

        return true;
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
