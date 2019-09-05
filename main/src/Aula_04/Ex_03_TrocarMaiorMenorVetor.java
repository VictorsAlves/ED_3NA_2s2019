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
public class Ex_03_TrocarMaiorMenorVetor {
    public static void main(String[] args) {
        int qtd = leInteiro();
        int v[]=new int[qtd];
        leVetorAleatorio(v);
        exibeVetor(v);
        trocaMaiorMenorVetor(v);
        exibeVetor(v);
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
public static void leVetorAleatorio(int[] v) {
        Random r = new Random();
       for (int i=0;i<v.length; i++){
           v[i]=(int)r.nextInt(51);    
       }
    }
    public static void exibeVetor(int[] v) {
       for (int i=0;i<v.length; i++){
           System.out.print(v[i]+ " ");    
       }
        System.out.println();
    }
    
    public static void trocaMaiorMenorVetor(int[] v) {
        int iMaior=0;
        int iMenor=0;
        for(int i=1; i<v.length;i++){
            if(v[i]>v[iMaior])
                iMaior=i;
            else
                if (v[i]<v[iMenor])
                    iMenor=i;
        }
        int aux=v[iMaior];
        v[iMaior]=v[iMenor];
        v[iMenor]=aux;
    }
        
}
