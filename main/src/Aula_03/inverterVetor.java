package Aula_03;

/**
 *
 * @author victor.salves5
 */
public class inverterVetor {
    
    public static void main(String[] args) {
        //inverterVetor();
        int [] v  = {9,8,7,6,5,4,3,2,1};
        inverterVetor(v);
    }

    private  static void inverterVetor(int[] vetor) {
    int ini = 0;
    int v;
    while (ini < vetor.length){
    v = vetor[ini]; // recebe o valor do contador
    vetor[vetor.length- ini] = vetor[ini]; // ultima posição do vetor recebe valor do inicio
    vetor[ini] = v;
     
        System.out.println(vetor[ini]);
        ini ++;
    }
    }
    
    private static void inverterVetorer(int [] v){
    
    int ini = 0;
    int fim = v.length-1;
        while (ini<fim) {
            
        }
            
            
            
             
        }
    }

