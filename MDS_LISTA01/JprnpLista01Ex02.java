/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ullrick
 */
public class JprnpLista01Ex02 {
    public static final int SZ = 10;
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);
        int vet[] = new int[SZ], primcount = 0, divcount, limite;
        boolean primo;
        
        System.out.println("Limite superior de números para o vetor: ");
        limite = Integer.parseInt(leitor.nextLine());
        
        for(short idx = 0; idx < SZ; idx++) {
            primo = true;
            divcount = 0;
            vet[idx] = gerador.nextInt(limite) + 1;
            for(short num = 1; num <= vet[idx]; num++) {
                if((vet[idx] % num) == 0) {
                    divcount++;
                }
                if(divcount > 2) {
                    primo = false;
                    break;
                }
            }
            if(divcount < 2) {
                primo = false;
            }
            if(primo == true) {
                primcount++;
            }
        }
        System.out.println("Vetor Gerado:");
        for(short idx = 0; idx < SZ; idx++) {
            System.out.print(vet[idx] + " ");
        }
        System.out.println("");
        System.out.println("No vetor existem " + primcount + " números primos");
        System.exit(0);
    }
}
