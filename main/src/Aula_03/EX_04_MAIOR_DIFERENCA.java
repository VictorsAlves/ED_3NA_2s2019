/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03;

/**
 *
 * @author victor.salves5
 */
public class EX_04_MAIOR_DIFERENCA {
    public static void main(String[] args) {
        int vetor[] = {1, 3, 2, 54, 56, 4, 32454, 4};
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(maiorDiferenca(vetor));
        }
        
        //int resultado =  maiorDiferenca(vetor);
        
        
    }

    private static int [] maiorDiferenca(int[] v) {
   int maior[] = new int [] {v[0],v[0]};
   
        for (int i = 0; i < v.length; i++) {
            if(v[i]< maior[1]){
            maior[1] = v[i];
            }
            
            if (v[i]> maior[0]){
            maior[0] = v[i];
            }
            
        }
    return maior;
    
    
    }
}
