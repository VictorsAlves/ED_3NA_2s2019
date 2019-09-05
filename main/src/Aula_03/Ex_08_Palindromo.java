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
public class Ex_08_Palindromo {
    public static void main(String[] args) {
        int n = leInteiro();
        if(Palindromo(n)==1){
            System.out.println(n+ " é palindromo");
        }
        else {
            System.out.println(n+ " NAO é palindromo");
        }
        
       
    }

    public static int leInteiro() {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número inteiro (<=100): ");
            n=sc.nextInt();    
        } while (n<=0 || n>=100000000);
        return n;
    }

    public static int inverterNum(int n) {
        int m=0;
        while (n>0){
            int resto=n%10;
            m = m*10 + resto;
            n=n/10; //atualização
        }
        return m;
    }

    private static int Palindromo(int n) {
       if (inverterNum(n)==n)
           return 1;
       else
           return 0;
    }
}
