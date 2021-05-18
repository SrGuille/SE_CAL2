/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

/**
 *
 * @author guial
 */
public class PrimalityCheck {

    public static boolean isPrime(int n) throws Exception {
        boolean prime = true; // assume innitially it is prime

        if (n < 0) {   // throw exception if number is negative
            throw new Exception();
        } else if (n < 2) { // 1 and 0 are considered not primes by convention
            prime = false;
        } else {
            int tryNum = 2;
            while (tryNum <= Math.sqrt(n) && prime == true) { //anything bigger than sqrt(n) is not necessary

                if (n % tryNum == 0) { //if any divisor can be found means that number is not prime
                    prime = false;
                }
                tryNum++;
            }
        }
        return prime;
    }

    public static boolean isPrime(Number number) throws Exception {
        int n = number.generateNumber();
        boolean prime = true; // assume innitially it is prime

        if (n < 0) {   // throw exception if number is negative
            throw new Exception();
        } else if (n < 2) { // 1 and 0 are considered not primes by convention
            prime = false;
        } else {
            int tryNum = 2;
            while (tryNum <= Math.sqrt(n) && prime == true) { //anything bigger than sqrt(n) is not necessary

                if (n % tryNum == 0) { //if any divisor can be found means that number is not prime
                    prime = false;
                }
                tryNum++;
            }
        }
        return prime;
    }
}
