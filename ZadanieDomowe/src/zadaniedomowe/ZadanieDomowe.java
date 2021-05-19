/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniedomowe;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public class ZadanieDomowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x = new Random().nextInt(3)+1;
        
        switch(x){
case 1: 
    System.out.println("Zadanie1");
    int a2,b2;
        a2=8;
        b2=4;
        System.out.println("suma: = "+ (a2+b2));
        System.out.println("roznica = "+ (a2-b2));
        System.out.println("iloczyn = "+ (a2*b2));
        System.out.println("iloraz = "+ (a2/b2));
break;
case 2:  
    System.out.println("Zadanie2");
    int a3,b3;
        double c3;
     
        a3=s.nextInt();
        b3=s.nextInt();
        c3=a3/b3;
        System.out.println("suma: = "+ (a3+b3));
        System.out.println("roznica = "+ (a3-b3));
        System.out.println("iloczyn = "+ (a3*b3));
        System.out.println("iloraz = "+c3);
break;
case 3: 
    System.out.println("Zadanie3");
    double a;
        double b;
        double suma,roznica,iloczyn,iloraz;
        a=6.5;
        b=5.3;
        suma=a+b;
        roznica=a-b;
        iloczyn=a*b;
        iloraz=a/b;
        
          System.out.println("suma = "+suma);
          System.out.println("roznica = "+roznica);
          System.out.println("iloczyn = "+iloczyn);
          System.out.println("iloraz = "+iloraz);
break;
case 4:
    System.out.println("Zadanie4");
    double a1;

        double b1;
        double suma1,roznica1,iloczyn1,iloraz1;
        
    
    
    a1=s.nextDouble();
    b1=s.nextDouble();
    
     suma1=a1+b1;
        roznica1=a1-b1;
        iloczyn1=a1*b1;
        iloraz1=a1/b1;
        
          System.out.println("suma = "+suma1);
          System.out.println("roznica = "+roznica1);
          System.out.println("iloczyn = "+iloczyn1);
          System.out.println("iloraz = "+iloraz1);
break; 
        
        
        
    }
    
}
}
