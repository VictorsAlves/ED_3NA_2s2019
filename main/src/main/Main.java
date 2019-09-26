/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author victor.salves5
 */
public class Main {


    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(10);
        
        pilha.empilha(5);
       pilha.empilha(8);
       pilha.empilha(4);
       pilha.desempilha();
        System.out.println(pilha.desempilha());
        
        
    }
    
}
