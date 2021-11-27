/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author devika
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=98,b=56; 
       Gcd gcd=new Gcd();
      System.out.println("GCD of given numbers "+a+" ,"+b+" = "+ gcd.solve(a,b));
    }
    public int solve(int a,int b){
    if(a==0)
        return b;
    if(b==0)
        return a;
    if(a==b)
        return a;
    if(a>b)
        return solve(a-b,b);
    return solve(a,b-a);
        
    }
    
}
