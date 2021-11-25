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
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n=311;
    if(prime(n)==true){
         System.out.println("The given number "+n+" is a prime number");
    }else{
        System.out.println("The given number "+n+" is not a prime number");
    }
    }
    public static boolean prime(int n){
    if(n==0||n<0||n==1){
        return false;
    }else if(n==2||n%2==0){
        return false;
    }else{
         for(int i=3;i*i<n;i=i+2){
                if(n%i==0){
                    return false;
                }
        }
        return true;
    }
    }
}
    
    
    
    

