/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02;

import static Aula_02.Ex_02_MediaVetor.exibeVetor;
import static Aula_02.Ex_02_MediaVetor.leVetorAleatorio;
import static Aula_02.Ex_02_MediaVetor.media;
import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_04_Primo {
    public static void main(String[] args) {
        int n = leInteiro();
        if (ePrimo(n))
            System.out.println(n + " Eh primo ");
        else
            System.out.println(n + " NAO Eh primo ");
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
