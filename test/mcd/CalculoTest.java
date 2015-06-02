package mcd;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @version 1.0
 * @author Daniel Seijas Iglesias
 */
public class CalculoTest {
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        
        System.out.println("obtenerMCD");
        int num1 = 36;
        int num2 = 60;
        Calculo instance = new Calculo();
        int expResult = 12;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        
        
    }
    
}
