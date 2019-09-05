/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03;

import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_10_ContarSubs {
    public static void main(String[] args) {
        int qtd = leInteiro();
        int v[]=new int[qtd];
        leVetor(v);
        System.out.println("O vetor possui = "+contaSubseq(v)+" subsequencias");
    }

    public static int leInteiro() {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print ("Digite um número inteiro (<=100): ");
            n=sc.nextInt();    
        } while (n<=0 || n>=100);
        return n;
    }

    public static void leVetor(int[] v) {
       Scanner sc=new Scanner(System.in);
       for (int i=0;i<v.length; i++){
           System.out.print ("Digite v["+i+"]= ");
           v[i]=sc.nextInt();    
       }
    }
    private static int contaSubseq(int[] v){
        int cont=1;
        for (int i=0; i<v.length-1; i++){
           if(v[i]!=v[i+1])
               cont++;
       }
       return cont;
    }
        
    
}
