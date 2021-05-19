/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniedomowe;

import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public class Zadanie4 {
     public static void main (String args[]){
        Scanner s=new Scanner(System.in);
    
  double a;
        double b;
        double suma,roznica,iloczyn,iloraz;
        
    
    
    a=s.nextDouble();
    b=s.nextDouble();
    
     suma=a+b;
        roznica=a-b;
        iloczyn=a*b;
        iloraz=a/b;
        
          System.out.println("suma = "+suma);
          System.out.println("roznica = "+roznica);
          System.out.println("iloczyn = "+iloczyn);
          System.out.println("iloraz = "+iloraz);
}
}
