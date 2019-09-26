package main;

import java.util.Scanner;

/**
 *
 * @author victor.salves5
 */
public class ParenteseColchet {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(10);
        
        
        Scanner lt  = new Scanner(System.in);
        
        String seq;
        System.out.println("Digite uma cadeia de caracteres que só tenha parenteses e colchetes");
        seq = lt.next();
        
        for (int i = 0; i < seq.length(); i++) {
            
            if(seq.charAt(i)== '[' || seq.charAt(i)== '['){
            pilha.empilha(seq.charAt(i));
            
            
            }
            
            else{
            //verifica se a pilha vazia
            if(pilha.vazia()){System.out.println("Não está bem formada a sequencia");
            return;
            }
                char charTopo = (char) pilha.desempilha();
                //verifica se houve problema
                if(charTopo=='(' && seq.charAt(i)== ']')
                    System.out.println("está bem formada");
            
            }
        if(pilha.vazia()){
            System.out.println("Está bem ormada a sequencia");} else{System.out.println("Não está bem formada a sequencia");}
        }
        
    }
}
