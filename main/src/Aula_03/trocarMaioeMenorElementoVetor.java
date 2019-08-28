package Aula_03;

/**
 * exercicio 3 
 * @author victor.salves5
 */
public class trocarMaioeMenorElementoVetor {

    public static void main(String[] args) {
        int[] v = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        TrocaDoVetor(v);
        
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    private static void TrocaDoVetor(int[] vetor) {
        int maior = vetor[0];
        int menor = vetor[0];
        int indiceMenor = 0;

        for (int i = 0; i < vetor.length-1; i++) {

           if(vetor[i]>vetor[maior]){
           maior = i;}
           

        }

    }

}
