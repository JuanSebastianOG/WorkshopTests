/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author sebastian
 */

/////PARA LA SUMA
@RunWith(value = Parameterized.class)
public class CalculadoraParametrosTest {
    
    @Parameters
    public static Iterable<Object[]> getData(){
        
        /*Pruebas twoAndThreeIsFive con 2,5,5
        twoAndZeroIsTwo con 2,0,0
        twoAndMinusTwoIsZero con 2,-2,0
        */
        return Arrays.asList(new Object[][]{
            {2,5,5},{2,0,2},{2,-2,0}
        });
        
    }
        
    private float a, b, exp;
    public CalculadoraParametrosTest(float a,float b,float exp) {
        this.a= a;
        this.b = b;
        this.exp = exp;

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAdd(){
        System.out.println("add");
        Calculadora calc = new Calculadora();
        
        float result = calc.add(a, b);
        assertEquals(exp, result, 0.0);
    }
}
