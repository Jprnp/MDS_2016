
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
public class JprnpLista01Ex06 {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número decimal:");
        int numb = leitor.nextInt();
        
        System.out.println("Número Octal: " + decToOctal(numb));
        
        System.exit(0);
    }
    public static int decToOctal(int numb) {
        String octstringrev = "";
        String octstring = "";
        int octal;
        
        while(numb > 0) {
            octstringrev = octstringrev + (numb % 8);
            numb = numb / 8;
                    
            if(numb <= 7) {
                octstringrev = octstringrev + numb;
                numb -= numb;
            }
        }
        char[] octarrayrev = octstringrev.toCharArray();
        for(int idx = (octstringrev.length() - 1); idx >= 0; idx--) {
            octstring = octstring + octarrayrev[idx];
        }
        
        octal = Integer.parseInt(octstring);
        
        return octal;
    }
}
