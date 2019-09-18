/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06;

/**
 *
 * @author ana.csantos119
 */
public class testaListaEncadeada {
    public static void main(String[] args) {
        /*
        No p = new No(10,null);
        No q = new No(20,p);
        No r = new No(30,q);
        System.out.println(r);
*/
        ListaEncadeada lst=new ListaEncadeada();
        
        lst.insereInicio(30);
        lst.insereInicio(20);
        lst.insereInicio(10);
        lst.insereFinal(40);
        lst.insereFinal(50);
        lst.insereOrdenadoR(35);
        lst.insereOrdenadoR(5);
        lst.insereOrdenadoR(85);
        System.out.println(lst);
        /*
        System.out.println(lst.buscaLinearIt(5));
        System.out.println(lst.buscaLinearIt(44));
        System.out.println(lst.buscaLinearIt2(5));
        System.out.println(lst.buscaLinearIt2(44)); */
        System.out.println(lst.buscaLinearR(5));
        System.out.println(lst.buscaLinearR(44));
        System.out.println(lst.buscaLinearR2(5));
        System.out.println(lst.buscaLinearR2(44));
        lst.insereFinalR(90);
        System.out.println(lst);
    }
}
