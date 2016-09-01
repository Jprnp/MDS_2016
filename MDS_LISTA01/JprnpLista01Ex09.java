import java.util.Scanner;
import java.util.Random;

public class JprnpLista01Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Quantidade de pessoas por grupo: ");
        int num = Integer.parseInt(leitor.nextLine());
        String[] grupoa = new String[num];
        String[] grupob = new String[num];
        int i;
        for (i = 0; i < num; i++){
            System.out.println("Digite o nome da pessoa " + (i + 1) 
                                                               + " do grupo A");
            grupoa[i] = leitor.nextLine();
        }
        for (i = 0; i < num; i++){
            System.out.println("Digite o nome da pessoa " + (i + 1) 
                                                               + " do grupo B");
            grupob[i] = leitor.nextLine();
        }
        generateMatch(num, grupoa, grupob);
        
        System.exit(0);
    }
    
    public static void generateMatch(int num, String[] likeA, String[] likeB){
        int i, j, k;
        int matches = 0;
        Random gerador = new Random();
        String[] matchA  = new String[num];
        String[] matchB  = new String[num];
        String[] match = new String[num];
        
        for (i = 0; i < num; i++){
            j = gerador.nextInt(num);
            matchA[i] =likeB[j];
            k = gerador.nextInt(num);
            matchB[i] = likeA[k];
        }
       
        for (i = 0; i < num; i++){
            for (int u = 0; u < num; u++){
                if ( (matchA[i].equals(likeB[u])) && 
                        (matchB[u].equals(likeA[i])) ){
                    match[matches] = "Match " + (matches + 1) + ":" + likeA[i] 
                                                            + " + " + likeB[u];
                    matches ++;
                }
            }
        }
        
        System.out.println("Total de matches: " + matches);
        System.out.println("");
        System.out.println("Lista de matches: ");
        
        for (i = 0; i < matches; i++){
            System.out.println(match[i]);   
        }
    }
    
}
