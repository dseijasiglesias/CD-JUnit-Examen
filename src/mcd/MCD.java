package mcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version 1.0
 * @author Daniel Seijas Iglesias
 */
public class MCD {

    public static void main(String[] args) throws IOException {
        
        Calculo calculo = new Calculo();
        
        String mensaje = "";
        
        mensaje = calculo.mensajes();
        System.out.println(mensaje);
        
        if(mensaje.equals("")){
            System.out.println("El MCD de " + calculo.getNumero1() + " y " + 
                        calculo.getNumero2() + " es: " + calculo.obtenerMCD
                        (calculo.getNumero1(), calculo.getNumero2()));
        }
        
        /**
        try{
            BufferedReader entradaTeclado = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.print("Introduzca el número 1: ");
            numero1 = Integer.parseInt(entradaTeclado.readLine());
            
            System.out.print("Introduzca el número 2: ");
            numero2 = Integer.parseInt(entradaTeclado.readLine());
            
            Calculo calculo = new Calculo();
            calculo.setNumero1(numero1);
            calculo.setNumero2(numero2);
        
            System.out.println("El MCD de " + calculo.getNumero1() + " y " + 
                    calculo.getNumero2() + " es: " + calculo.obtenerMCD
                    (calculo.getNumero1(),calculo.getNumero2()));

            System.out.println("Resultado del cálculo: " + 
                    calculo.getMensajeResultado());            
        
        }catch (NumberFormatException e){
            System.out.println("Debe introducir un número válido: " +
                    e.getMessage());
        }catch (IOException e){
            System.out.println("Error al introducir datos: " +
                    e.getMessage());
        }
        */
    }
}