/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jprnpaula02ex02;

import java.util.Scanner;

/**
 *
 * @author Alunoinf_2
 */
public class JprnpAula02Ex02 {
    public static void main(String[] args) {
        int dia;
        Scanner leitor = new Scanner(System.in);
        String dias[] = {
            "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta",
            "Sábado"
        };
        
        System.out.println("Digite o número do dia:");
        dia = Integer.parseInt(leitor.nextLine());
        
        System.out.println(dias[(dia - 1)]);
        
/*        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }   */
    }
}
