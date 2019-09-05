package Aula_05;

/**
 *
 * @author victor.salves5
 */
public class EX_09_QuieficienteDivisao {
    public static void main(String[] args) {
        
    }
    
    
    public static int quoDiv(int n1, int n2){
            
            if (n1<n2)
            return 0;
            return 1+ quoDiv(n1-n2,2);
}}
