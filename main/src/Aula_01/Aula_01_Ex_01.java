/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01;

import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Aula_01_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtd = leInteiro();
        int v[]=new int[qtd];
        leVetor(v);
        int nVezes=qtdMaioresMedia(v);
        System.out.println("O Vetor possui "+nVezes+"maiores que a média");
    }

    public static int leInteiro() {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um número inteiro (<=100):");
            n=sc.nextInt();    
        } while (n<=0 || n>=100);
        return n;
    }

    public static void leVetor(int[] v) {
       Scanner sc=new Scanner(System.in);
       for (int i=0;i<v.length; i++){
           System.out.println("Digite v["+i+"]= ");
           v[i]=sc.nextInt();    
       }
    }
    
    public static double media(int[] v){
        int soma=0;
        for (int i=0;i<v.length; i++){
           soma=soma+v[i];
        }
        return soma/v.length;
    }
    
    public static int qtdMaioresMedia(int[] v) {
        int m= (int)media (v);
        int cont=0;
        for (int i=0;i<v.length; i++){
           if (v[i]>m){
               cont++;
           }
       }
       return cont;   
    }   
}
