package mcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version 1.0
 * @author Daniel Seijas Iglesias
 */
public class Calculo {
    private int numero1;
    private int numero2;
    private String mensajeResultado = "";

    public Calculo() {
    }

    public Calculo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //setters
    public void setNumero1(int numero) {
        this.numero1 = numero;
        //si el número es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
        //si el número es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    //resultado del cálculo del MCD
    public String getMensajeResultado() {
        return mensajeResultado;
    }
    
    
    
    
    
    
    
    
    public String mensajes(){
        
        String mensaje = "";
        
        try{
            BufferedReader entradaTeclado = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.print("Introduzca el número 1: ");
            int num1 = Integer.parseInt(entradaTeclado.readLine());
            
            if(num1<0){
                mensaje = "Error, los numeros no pueden ser negativos";
                return mensaje;
            }
            
            System.out.print("Introduzca el número 2: ");
            int num2 = Integer.parseInt(entradaTeclado.readLine());
            
            if(num2<0){
                mensaje = "Error, los numeros no pueden ser negativos";
                return mensaje;
            }
            
            this.setNumero1(num1);
            this.setNumero2(num2);
            
        }catch (NumberFormatException e){
            mensaje = ("Debe introducir un número válido: " +
                    e.getMessage());
        }catch (IOException e){
            mensaje = ("Error al introducir datos: " +
                    e.getMessage());
        }
        return mensaje;
    }
    

    
    
    
    
    
    
    //getters
    //encapsulamos la modificación de las variables numero1 y numero2
    //para comprobar que los valores son correctos entre 
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    //método para calcular el MCD
    public int obtenerMCD(int num1, int num2) {
        int resto;
        int numDiv1 = num1;
        int numDiv2 = num2;
        
        if (num1 <0 || num2 < 0) return 0;
       
        try {
            do {
                resto = numDiv1 % numDiv2;
                numDiv1 = numDiv2;
                if (resto != 0) {
                    numDiv2 = resto;
                }
            } while (resto != 0);

            mensajeResultado = "Cálculo correcto";
            return numDiv2;
        } catch (Exception e) {
            mensajeResultado = "Error en cálculo de MCD: " + e.getMessage();
            return 0;
        }
    }
}
