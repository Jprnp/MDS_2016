
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
public class JprnpLista01Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();
        char[] array = palavra.toCharArray();
//        boolean palindromo;
        if(isPalindrome(array)) {
            System.out.println("É palíndromo");
        }
        else {
            System.out.println("Não é palíndromo");
        }
        
        System.exit(0);
    }
        
    public static boolean isPalindrome(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
               return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
