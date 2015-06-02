package mcd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version 1.0
 * @author Daniel Seijas Iglesias
 */
public class CalculoMensajeTest {
    
    public CalculoMensajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    /**
     * Test of mensajes method, of class Calculo.
     */
    @Test
    public void testMensajes() {
        System.out.println("mensajes");
        
        Calculo instance = new Calculo();
        instance.mensajes();
        
        String expResult = "Debe introducir un número válido: null";
        String result = instance.mensajes();
        assertEquals(expResult, result);
        
    }

}