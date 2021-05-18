/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;
import static primes.PrimalityCheck.*;

/**
 *
 * @author guial
 */
public class PrimalityCheckTest {

    private Number mock;

    public PrimalityCheckTest() {

    }

    /**
     * Test of isPrime method, of class PrimalityCheck.
     */
    @org.junit.Test
    public void testIsPrimeNegative() throws Exception {
        assertThrows(Exception.class, () -> isPrime(-12), "Check if -12 is prime");
    }

    @org.junit.Test
    public void testIsPrime0() throws Exception {
        boolean expectedResult = false;
        boolean result = isPrime(0);
        assertEquals(expectedResult, result, "Check if 0 is prime");
    }

    @org.junit.Test
    public void testIsPrime1() throws Exception {
        boolean expectedResult = false;
        boolean result = isPrime(1);
        assertEquals(expectedResult, result, "Check if 1 is prime");
    }

    @org.junit.Test
    public void testIsPrime7() throws Exception {
        boolean expectedResult = true;
        boolean result = isPrime(7);
        assertEquals(expectedResult, result, "Check if 7 is prime");
    }

    @org.junit.Test
    public void testIsPrime200() throws Exception {
        boolean expectedResult = false;
        boolean result = isPrime(200);
        assertEquals(expectedResult, result, "Check if 200 is prime");
    }

    @org.junit.Test
    public void testIsPrime449() throws Exception {
        boolean expectedResult = true;
        boolean result = isPrime(449);
        assertEquals(expectedResult, result, "Check if 449 is prime");
    }

    @org.junit.Test
    public void mockTestIsPrimeNegative() throws Exception {

        mock = createMock(Number.class);
        expect(mock.generateNumber()).andReturn(-12);

        replay(mock); //start waiting for calls

        assertThrows(Exception.class, () -> isPrime(mock), "Check if -12 is prime with mock");

        verify(mock); //We force that the lack of calls is also an error

        reset(mock); //teardown mock
    }

    @org.junit.Test
    public void mockTest0() throws Exception {

        mock = createMock(Number.class);
        expect(mock.generateNumber()).andReturn(0);

        replay(mock); //start waiting for calls

        boolean expectedResult = false;
        boolean result = isPrime(mock);
        assertEquals(expectedResult, result, "Check if 0 is prime with mock");

        verify(mock); //We force that the lack of calls is also an error

        reset(mock); //teardown mock
    }

    @org.junit.Test
    public void mockTest1() throws Exception {

        mock = createMock(Number.class);
        expect(mock.generateNumber()).andReturn(1);

        replay(mock); //start waiting for calls

        boolean expectedResult = false;
        boolean result = isPrime(mock);
        assertEquals(expectedResult, result, "Check if 1 is prime with mock");

        verify(mock); //We force that the lack of calls is also an error

        reset(mock); //teardown mock
    }

    @org.junit.Test
    public void mockTest11() throws Exception {

        mock = createMock(Number.class);
        expect(mock.generateNumber()).andReturn(11);

        replay(mock); //start waiting for calls

        boolean expectedResult = true;
        boolean result = isPrime(mock);
        assertEquals(expectedResult, result, "Check if 11 is prime with mock");

        verify(mock); //We force that the lack of calls is also an error

        reset(mock); //teardown mock
    }

    @org.junit.Test
    public void mockTest12() throws Exception {

        mock = createMock(Number.class);
        expect(mock.generateNumber()).andReturn(12);

        replay(mock); //start waiting for calls

        boolean expectedResult = false;
        boolean result = isPrime(mock);
        assertEquals(expectedResult, result, "Check if 12 is prime with mock");

        verify(mock); //We force that the lack of calls is also an error

        reset(mock); //teardown mock
    }

}
