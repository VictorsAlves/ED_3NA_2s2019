package Aula_03;

/**
 * função que inverte a ordem dos elementos de um vetor
 *
 * @author Victor
 */
public class EX_02_INVERTER_On {

    public static void main(String[] args) {
        int vetor[] = {1, 3, 2, 54, 56, 4, 32454, 4};

        inverterVetor(vetor);
        mostrar(vetor);
    }

    private static void inverterVetor(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            trocar(vetor, inicio, fim);
                inicio++; 
                fim--;
        }

    }

    private static void trocar(int[] v, int inicio, int fim) {
        int aux = v[inicio];
        v[inicio] = v[fim];
        v[fim] = aux;
        
        
    }
    
    private static void mostrar (int[] v){
    for(int x: v){
        System.out.println(x + " ");}
    }
}
