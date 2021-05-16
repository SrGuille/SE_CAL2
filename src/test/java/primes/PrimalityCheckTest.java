/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static primes.PrimalityCheck.isPrime;

/**
 *
 * @author guial
 */
public class PrimalityCheckTest {
    
    public PrimalityCheckTest() {
    }

    /**
     * Test of isPrime method, of class PrimalityCheck.
     */
    @Test
    public void testIsPrime7() throws Exception {
        boolean expectedResult=true;
        boolean result= isPrime(7);
        assertEquals(expectedResult,result,"Check if 7 is prime");
    }
    
    @Test
    public void testIsPrime449() throws Exception {
        boolean expectedResult=true;
        boolean result= isPrime(449);
        assertEquals(expectedResult,result,"Check if 449 is prime");
    }
    
    @Test
    public void testIsPrime200() throws Exception {
        boolean expectedResult=false;
        boolean result= isPrime(200);
        assertEquals(expectedResult,result,"Check if 200 is prime");
    }
    
    @Test
    public void testIsPrime1() throws Exception {
        assertThrows(Exception.class,() -> isPrime(1),"Check if 1 is prime");
    }
    
    @Test
    public void testIsPrimeNegative() throws Exception {
        assertThrows(Exception.class,() -> isPrime(-12),"Check if -12 is prime");
    }
}
