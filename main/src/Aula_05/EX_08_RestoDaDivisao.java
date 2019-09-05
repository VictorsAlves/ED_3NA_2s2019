package Aula_05;

/**
 * quantas vezes um o dividendo cabe no divisor
 *
 * @author victor.salves5
 */
public class EX_08_RestoDaDivisao {

    public static void main(String[] args) {

        //Retorna o resto da divisao de x/y de forma recursiva
        System.out.println(restoDiv(25,4));
    }

    public static int restoDiv(int divisor, int dividendo) {
        if (divisor == dividendo) {
            return 0;
        }
        
        if(divisor > dividendo) return dividendo;
        
        return restoDiv((divisor - dividendo), dividendo);
        

    }
}
