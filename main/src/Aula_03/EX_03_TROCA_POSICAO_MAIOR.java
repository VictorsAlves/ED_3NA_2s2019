
package Aula_03;

/**
 * encontra o maior e o menor elemento do vetor e troca seus indices
 * @author Victor
 */
public class EX_03_TROCA_POSICAO_MAIOR {
    public static void main(String[] args) {
                int vetor[] = {1, 3, 2, 54, 56, 4, 32454, 4};
                int indiceMaior = buscarMaior(vetor);
        
        
        
        
    }
    
    
    private static void trocaMenor(int[] v, int maior, int menor){
        for (int i = 0; i <v.length; i++) {
            if(v[i]==maior){
            v[i] = menor;
            }
            if(v[i]==menor)
            {
            v[i] = maior;}        
        }
    
    }

    
    
    private static int buscarMenor(int[] vetor) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]< vetor[maior]){
            maior = i;
            }
        }
    return maior;
    }
    private static int buscarMaior(int[] vetor) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]> vetor[maior]){
            maior = i;
            }
        }
    return maior;
    }
}
