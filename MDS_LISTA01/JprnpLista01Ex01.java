/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Ullrick
 */
public class JprnpLista01Ex01 {
    
    
    public static final int SZ = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int vet[] = new int[SZ], menor = Integer.MAX_VALUE;
        
        System.out.println("Digite os campos do vetor de " + SZ + " posições");
        for(short idx = 0; idx < SZ; idx++) {
            vet[idx] = leitor.nextInt();
            if (vet[idx] < menor) {
                menor = vet[idx];
            } 
        }
        System.out.println("Menor número: " + menor);
        System.exit(0);
    }    
}
