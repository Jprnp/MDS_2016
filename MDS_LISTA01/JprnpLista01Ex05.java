
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
public class JprnpLista01Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número decimal:");
        int numb = leitor.nextInt();
        
        System.out.println("Número binário: " + decToBinary(numb));
        
        System.exit(0);
    }
    public static int decToBinary(int numb) {
        String binstringrev = "";
        String binstring = "";
        int binary;
        
        while(numb > 0) {
            binstringrev = binstringrev + (numb % 2);
            numb = numb / 2;
                    
            if(numb == 1) {
                binstringrev = binstringrev + "1";
                numb -= 1;
            }
        }
        char[] binarrayrev = binstringrev.toCharArray();
        for(int idx = (binstringrev.length() - 1); idx >= 0; idx--) {
            binstring = binstring + binarrayrev[idx];
        }
        
        binary = Integer.parseInt(binstring);
        
        return binary;
    }
}
