package Aula_02;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Ex_07_InverterNumero {
    public static void main(String[] args) {
        int n = leInteiro();
        System.out.println(n+" == "+inverterNum(n)+ " invertido");
       
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
}
