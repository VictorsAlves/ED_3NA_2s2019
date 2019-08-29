package Aula_03;

/**
 *
 * @author Victor
 * 
 */
public class EX_05_SEGMENTO_CRESCENTE {
    public static void main(String[] args) {
        //int v[] = {1, 3, 2, 54, 56, 4, 32454, 4};
        int v[] = {5, 10, 3, 2, 4, 7, 9, 8, 5};
        int comprimento  = comprimentoCrescente(v);
        System.out.println(comprimento);
    }

    private static int comprimentoCrescente(int[] v) {
        int cont = 1;
        int max = 1;
        
        for (int i = 0; i < v.length-1; i++) {
            
            if(v[i]<v[i+1]){
            cont++;
            }
            else {
            if(cont>max){
            max = cont;
            cont = 1;}
            }
             if(cont>max){
            max = cont;
            cont = 1;}
                   
           }
        return max;
        
        
        
        }


    }
    
