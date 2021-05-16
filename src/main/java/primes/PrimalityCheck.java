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
        boolean prime = true; //we assume innitially it is prime
        if (n<2) // it doesn't make sense to input numbers smaller than 2
        {
            throw new Exception();
        }
        else{
            int tryNum=2;
            while (tryNum<=Math.sqrt(n) && prime==true){ //anything bigger than sqrt(n) is not necessary
                
                if (n%tryNum==0) { //if we can find any divisor, this means it is not prime
                    prime=false;
                }
                tryNum++;
            }
        }
        return prime;
    }
}

