package Aula_05;

/**
 *
 * @author victor.salves5
 */
public class EX_07_PrimosRecursivos {
    
    
    public static void main(String[] args) {
        
    }


public static boolean numeroPrimo(int n, int d ){

 if(n/2 < d){
            return true;
        } else {
            if(n%d==0){
                return false;
            } else {
                return numeroPrimo(n, d+1);
            }
        }

}



}
