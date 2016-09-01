
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ullrick
 */
public class JprnpLista01Ex11 {
    public static void main(String[] args) {
        String[] pessoas = new String[4];
        String oldest = "";
        int idade, midade = Integer.MIN_VALUE;
        Scanner leitor = new Scanner(System.in);
        
        for(short idx = 0; idx < 4; idx++) {
            System.out.println("Nome da pessoa " + (idx + 1) + ":");
            pessoas[idx] = leitor.nextLine();
            System.out.println("Idade da pessoa " + (idx + 1) + ":");
            idade = Integer.parseInt(leitor.nextLine());
            
            if(idade > midade) {
                midade = idade;
                oldest = pessoas[idx];
            }
        }
        
        Arrays.sort(pessoas);
        
        System.out.println("*-----------------------------------------------*");
        System.out.println("*Lista de pessoas:                              *");
        System.out.println("*-----------------------------------------------*");
        
        for(short idx = 0; idx < 4; idx++) {
            System.out.println(pessoas[idx]);
        }
        
        System.out.println("_________________________________________________");
        System.out.println("Pessoa mais velha: " + oldest);
    }
}
