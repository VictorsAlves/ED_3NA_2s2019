/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04;

import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_06_Inters2Vetores {
    public static void main(String[] args) {
        int qtd = leInteiro();
        int v1[]=new int[qtd];
        int v2[]=new int[qtd];
        leVetor(v1);
        leVetor(v2);
        exibeVetor(v1);
        exibeVetor(v2);
        inters2Vetores(v1,v2);
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

    public static void inters2Vetores(int[] v1, int[] v2) {
        int i=0;
        int j=0;
        while (i<v1.length && j<v2.length){
            if (v1[i]==v2[j]){
                System.out.print(v1[i] + " ");
                i++; j++;
            }
            else{
                 if (v1[i]<v2[j]){
                     i++;
                 }
                 else{
                     j++;
                 }
            }
        }
    }
        
}
