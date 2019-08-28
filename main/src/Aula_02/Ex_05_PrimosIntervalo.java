/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02;

import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_05_PrimosIntervalo {
    public static void main(String[] args) {
        int n1 = leInteiro();
        int n2 = leInteiro();
        for (int i=n1;i<=n2;i++){
            if (ePrimo(i))
                System.out.print(i+ " ");
        }
        System.out.println();
        
    }

    public static int leInteiro() {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número inteiro (<=100): ");
            n=sc.nextInt();    
        } while (n<=0 || n>=100);
        return n;
    }

    public static boolean ePrimo(int n) {
        int ndiv=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                ndiv++;
        if (ndiv<=2)
            return true;
        return false;
    }
}
