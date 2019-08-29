
package Aula_03;

/**
 * encontra o maior e o menor elemento do vetor e troca seus indices
 * @author Victor
 */
public class EX_03_TROCA_POSICAO_MAIOR {
    public static void main(String[] args) {
                int vetor[] = {1, 3, 2, 54, 56, 4, 32454, 4};
                
                
               trocaMenor(vetor);
        
        
        
        
    }
    
    
    private static void trocaMenor(int[] v){
        int menor = 0;
        int maior = 1;
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
                 if(v[i]>maior){
                 maior = i;
                 }
                 
                 if (v[i]<menor){
                 menor = i;
                 }
                 
                 if(v[maior]>v[menor]){
                    aux = v[menor];
                    v[menor] = v[maior];
                    v[maior] = aux;
        }
        }
    
    }

    
    
   
}
