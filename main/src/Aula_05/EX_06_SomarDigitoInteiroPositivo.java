package Aula_05;

/**
 * soma os digitos de um numero por exemplo 123 = 1+2+3
 * @author victor.salves5
 */
public class EX_06_SomarDigitoInteiroPositivo {
    public static void main(String[] args) {
        
    }
    
    public static int somaDigito(int n){
    
    if(n<10)
        return n;
        
    return n%10 + somaDigito(n/10);
    }
}
