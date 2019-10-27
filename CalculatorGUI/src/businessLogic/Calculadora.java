/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author Anabel
 */
public class Calculadora {
    
    public static float add(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        return a/b;
    }
    
    public static float mod(float a, float b)
    {
        return a%b;
    }
    public static float signo(float a)
    {
        return -a;
    }
    public static float tenPow(float a, float b)
    {
    	return a * (float)Math.pow(10,b);
    }
    public static float sqrt(float a)
    {
    
            try{
            return (float) Math.sqrt(a);
            }catch(Exception e){
                return -1;
            }
    }
    public static float log(float a)
    {
    	return (float) Math.log(a);
    }
    public static float nFact(float a)
    {
    	float resultado = 1;
    	for (float i = a; i > 0; i--)
    	{
    		resultado *= i;
    	}
    	return resultado;
    }
    
}
