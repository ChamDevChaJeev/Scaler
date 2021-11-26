/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author devika
 */
public class PrimeNumberRecursion {
static int i = 3;
  
// Function check whether a number
// is prime or not
public static boolean isPrime(int in)
{
    System.out.println(i); 
    // Corner cases
    if (in<=1)
    {
        return false;
    }
   if(in%2==0)
   {
   return false;
   }
    // Checking Prime
    if (in < i*i)
        return true;
         
    // Base cases
    if (in % i == 0)
    {
        return false;
    }
    i=i+2;
    return isPrime(in);
}
public static void main(String[] args){
if (isPrime(413)==true){
System.out.println("The given number is prime");
}else{
    System.out.println("The given number is not prime");
}
}
}
