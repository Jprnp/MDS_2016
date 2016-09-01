
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
public class JprnpLista01Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número:");
        int num = leitor.nextInt();
      
        System.out.println("Número invertido : " + reverseInt(num) );
    }
    
    public static int reverseInt(int num) {
        int tamanho, reverse = 0;
        if(num != 0) {
            tamanho = (int)(Math.log10(num)+1);
        }
        else {
            return 0;
        }
        for(short idx = 1; idx <= tamanho; idx++) {
            reverse *= 10;
            reverse += (num % 10);
            num /= 10;
        }
        return reverse;
    }
    
}
