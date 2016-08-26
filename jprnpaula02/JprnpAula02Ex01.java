/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jprnpaula02;

import java.util.Scanner;


/**
 *
 * @author João Pedro R. N. Pinheiro
 */
public class JprnpAula02Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        x = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Digite o segundo número:");
        y = Integer.parseInt(leitor.nextLine());
        
        if(x > y){
            System.out.println("O menor número é: " + y);
        }
        else{
            System.out.println("O menor número é: " + x);
        }
        System.exit(0);
    }
    
}
