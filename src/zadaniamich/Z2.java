/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniamich;

import java.util.Scanner;

/**
 *
 * @author mrmor
 */
public class Z2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a,b;
        double c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a/b;
        System.out.println("suma: = "+ (a+b));
        System.out.println("roznica = "+ (a-b));
        System.out.println("iloczyn = "+ (a*b));
        System.out.println("iloraz = "+c);
        // TODO code application logic here
    }
    
}
