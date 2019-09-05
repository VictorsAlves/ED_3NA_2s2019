/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_05_ComrMaxSub {
    public static void main(String[] args) {
        int qtd = leInteiro();
        int v[]=new int[qtd];
        leVetor(v);
        exibeVetor(v);
        System.out.println(maxComprSeqVetor(v));
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
    public static void exibeVetor(int[] v) {
       for (int i=0;i<v.length; i++){
           System.out.print(v[i]+ " ");    
       }
        System.out.println();
    }


    public static int maxComprSeqVetor(int[] v) {
        int cont=1;
        int max=1;
        
        for (int i=0; i<v.length-1;i++){
            if (v[i]<v[i+1])
                cont++;
            else{
                if(cont>max)
                    max=cont;
                cont=1;
            }
        }
        //Validar quando a última sequencia tem compr maximo
        if(cont>max)
            max=cont;
        
        return max;
    }
        
}
