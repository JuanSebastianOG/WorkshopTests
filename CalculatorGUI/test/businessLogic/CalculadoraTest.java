/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebastian
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
    
    
    /**
     * Test of Add method, of class Calculadora.
     */
    @Test
    public void twoAndThreeIsFive() {
        System.out.println("Add");
        float a = 2F;
        float b = 3F;
        float expResult = 5F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
     /**
     * Test of Add method, of class Calculadora.
     */
    @Test
    public void twoAndZeroIsTwo() {
        System.out.println("Add");
        float a = 2F;
        float b = 0F;
        float expResult = 2F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
      /**
     * Test of Add method, of class Calculadora.
     */
    @Test
    public void twoAndMinusTwoIsZero() {
        System.out.println("Add");
        float a = 2F;
        float b = -2F;
        float expResult = 0F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float a = 10F;
        float b = 5F;
        float expResult = 5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
     /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void threeMinusTwoIsOne() {
        System.out.println("substract");
        float a = 3F;
        float b = 2F;
        float expResult = 1F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void threeMinusThreeIsZero() {
        System.out.println("substract");
        float a = 3F;
        float b = 3F;
        float expResult = 0F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void threeMinusMinusThreeIsSix() {
        System.out.println("substract");
        float a = 3F;
        float b = -3F;
        float expResult = 6F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void ThreeXThreeIsNine() {
        System.out.println("multiply");
        float a = 3F;
        float b = 3F;
        float expResult = 9F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void ThreeXZeroIsZero() {
        System.out.println("multiply");
        float a = 3F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void ThreeXMinusThreeIsMinusNine() {
        System.out.println("multiply");
        float a = 3F;
        float b = -3F;
        float expResult = -9F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 20F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void EightDivFourIsTwo() {
        System.out.println("div");
        float a = 8F;
        float b = 2F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
     /**
     * Test of div method, of class Calculadora.
     */
    @Test(expected = AssertionError.class)
        public void DivInZero() throws Exception {
            System.out.println("div");
            float a = 5F;
            float b = 0F;
            float expResult = 0F;
            float result = Calculadora.div(a, b);
            assertEquals(expResult, result, 0.0);
        }
        
        /**
     * Test of Mod method, of class Calculadora.
     */
    @Test
    public void TwelveModFive() {
        System.out.println("mod");
        float a = 12F;
        float b = 5F;
        float expResult = 2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }
     /**
     * Test of Mod method, of class Calculadora.
     */
    @Test
    public void TwoModThree() {
        System.out.println("mod");
        float a = 2F;
        float b = 3F;
        float expResult = 2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }
        
    /**
     * Test of x10 method, of class Calculadora.
     */
    @Test
    public void fivePowTenThree() {
        System.out.println("mod");
        float a = 5F;
        float b = 3F;
        float expResult = 5000F;
        float result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of x10 method, of class Calculadora.
     */
    @Test
    public void fivePowTenMinusThree() {
        System.out.println("mod");
        float a = 5F;
        float b = -3F;
        float expResult = 0.005F;
        float result = Calculadora.tenPow(a, b);
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of sqrt method, of class Calculadora.
     */
    @Test
    public void sqrt1() {
        System.out.println("sqrt");
        float a = 452321F;
        float expResult = 672.54816F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of sqrt method, of class Calculadora.
     */
    @Test
    public void sqrtofNine() {
        System.out.println("sqrt");
        float a = 9F;
        float expResult = 3F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of sqrt method, of class Calculadora.
     */
    
    public void sqrtofNegative()  {
        System.out.println("sqrt");
        float a = -3F;
        float expResult = -1F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }
}
