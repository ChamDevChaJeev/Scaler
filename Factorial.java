/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author devika
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=6;
        Factorial fact=new Factorial();
        int ans=fact.solve(n);
        System.out.println("Factorial of "+n+" = "+ans);
        
    }
    public int solve(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
        fact=fact*i;
        }
    return fact;
    }
    
}
