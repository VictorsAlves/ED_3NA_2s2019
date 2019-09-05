package Aula_05;

/**
 *
 * @author victor.salves5
 */
public class EX_05_PotenciaMelhorada {
    public static void main(String[] args) {
        
    }


   public static int result (int b,int e){
    if(b==1)
        return e;
    else 
        return e*result(b, e-1);
    }

}
