/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02;

import static Aula_02.Ex_05_PrimosIntervalo.ePrimo;
import java.util.Scanner;

/**
 *
 * @author ana.csantos119
 */
public class Ex_06_Conv_Dec2Bin {
    public static void main(String[] args) {
        System.out.println("Digite um número decimal: ");
        int decimal = leInteiro();
        System.out.println(decimal+" == "+Dec2Bin(decimal));
         System.out.println("Digite um número binário: ");
        int bin = leInteiro();
        System.out.println(bin+" == "+Bin2Dec(bin));
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

    public static int Dec2Bin(int decimal) {
        int bin=0;
        int cont=0;
        while(decimal>0){
            int resto=decimal%2;
            bin=bin+ resto*(int)Math.pow(10.0,cont);
            decimal=decimal/2; //atualização
            cont++;
        }
        return bin;
    }
    public static int Bin2Dec(int binario) {
        int dec=0;
        int cont=0;
        while(binario>0){
            int resto=binario%10;
            dec=dec+ resto*(int)Math.pow(2.,cont);
            binario=binario/10; //atualização
            cont++;
        }
        return dec;
    }
}
