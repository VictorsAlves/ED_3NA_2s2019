package Aula_05;

/**
 * potencia recursiva com base fixa
 * @author victor.salves5
 */
public class EX_01_PotenciaRecursiva {
    public static void main(String[] args) {
        System.out.println(result(5));
    }
    
    
    public static int result (int n){
    if(n==1)
        return 2;
    else 
        return 2*result(n-1);
    }
}
