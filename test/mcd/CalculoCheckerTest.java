package mcd;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @version 1.0
 * @author Daniel Seijas Iglesias
 */
@RunWith(Parameterized.class)
public class CalculoCheckerTest {
    private Calculo calculo;
    
    private final int expectedResult;
    
    private final int numOne;
    private final int numTwo;
    
    private int resto;
    
    @Before
    public void initialize() {
        calculo = new Calculo();
    }
    
    
    public CalculoCheckerTest(int numOne, int numTwo, int expectedResult) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.expectedResult = expectedResult;
    }
    
    @Parameterized.Parameters
    public static Collection Calculo() {
        return Arrays.asList(new Object[][] {
            { 36, 60, 12},
            { 42, 58, 2},
            { 35, 19, 1},
            { 78, 42, 6},
        });
    }
   
   
    @Test
    public void testCalculoChecker() {
        System.out.println("Parametros testeados : " + numOne + ", " + numTwo);
        assertEquals(expectedResult, calculo.obtenerMCD(numOne, numTwo), 1);
    }
    
}
