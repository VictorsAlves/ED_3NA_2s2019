package Aula_07;

import Aula_06.*;

/**
 * fizemos a iserção de novas funcionalidade na lista encadeada tais como
 * remoção ordenada, remoção de inicio, remoção de final, iterativa e recursiva
 *
 * @author victor.salves5
 */
public class Aula_07 {

    public static void main(String[] args) {

        ListaEncadeada le = new ListaEncadeada();

        le.insereInicio(0);
        le.insereFinal(5);
        le.insereFinal(10);
        le.insereFinal(9);
        le.insereFinal(8);
        le.insereFinal(4);
  
        le.invertNos();
      
        
          System.out.println(le);
    
    
    }

}
