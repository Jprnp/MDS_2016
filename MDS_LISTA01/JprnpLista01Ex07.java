
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
public class JprnpLista01Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Dia:");
        int dia = leitor.nextInt();
        
        System.out.println("Mês:");
        int mes = leitor.nextInt();
        
        System.out.println("Ano:");
        int ano = leitor.nextInt();
        
        if(checkValidDate(dia, mes, ano)) {
            System.out.println("Data Valida!");
            System.out.println("Mes: " + nomeMes(mes));
        }
        else {
            System.out.println("Data Invalida!");
            System.out.println("Mes: " + nomeMes(mes));
        }
    }
    
    public static boolean checkValidDate(int dia, int mes, int ano) {
        if((mes < 1) || (mes > 12)) {
            return false;
        }
        
        if(dia > 1) {
            switch(mes) {
                case 1:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                case 2:
                    if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
                    {
                        if (dia > 29) {
                            return false;
                        }
                    }
                    else {
                        if (dia > 28) {
                            return false;
                        }
                    }
                    break;
                case 3:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                case 5:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                case 7:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                case 8:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                case 10:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                case 12:
                    if(dia > 31) {
                        return false;
                    }
                    break;
                default:
                    if(dia > 30) {
                        return false;
                    }                
            }
        }
        else {
            return false;
        }
        return true;
    }
    
    public static String nomeMes(int mes) {
        String nomemes[] = { "Janeiro", "Fevereiro", "Marco", "Abril",
        "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", 
        "Dezembro"};
        
        if((mes > 0) && (mes < 13)) {
            return nomemes[mes - 1];
        }
        else {
            return "Invalido!";
        }
    }
}
