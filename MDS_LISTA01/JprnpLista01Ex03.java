
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ullrick
 */
public class JprnpLista01Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calendar nasc  = Calendar.getInstance();
        Calendar agora =  Calendar.getInstance();
        
        String datahora = "" + agora.get(Calendar.DAY_OF_MONTH) + " de ";
        
        switch (agora.get(Calendar.MONTH)) {
            case 0:
                datahora = datahora + "Janeiro de ";
                break;
            case 1:
                datahora = datahora + "Fevereiro de ";
                break;
            case 2:
                datahora = datahora + "Março de ";
                break;
            case 3:
                datahora = datahora + "Abril de ";
                break;
            case 4:
                datahora = datahora + "Maio de ";
                break;
            case 5:
                datahora = datahora + "Junho de ";
                break;
            case 6:
                datahora = datahora + "Julho de ";
                break;
            case 7:
                datahora = datahora + "Agosto de ";
                break;
            case 8:
                datahora = datahora + "Setembro de ";
                break;
            case 9:
                datahora = datahora + "Outubro de ";
                break;
            case 10:
                datahora = datahora + "Novembro de ";
                break;
            case 11:
                datahora = datahora + "Dezembro de ";
                break;
        }
        
        datahora = datahora + agora.get(Calendar.YEAR) + " - " + 
                              agora.get(Calendar.HOUR_OF_DAY) + ":" + 
                              agora.get(Calendar.MINUTE);
        
        System.out.println(datahora);
        
        System.out.println("Dia de Nascimento: ");
        int dia = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Mês de Nascimento: ");
        int mes = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Ano de Nascimento: ");
        int ano = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Hora de Nascimento: ");
        int hora = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Minuto de Nascimento: ");
        int minuto = Integer.parseInt(leitor.nextLine());        
        
        nasc.set(ano, (mes - 1), dia, hora, minuto);
        System.out.println("Total de segundos de vida: " + 
                                                      getDifDates(nasc, agora));
        
        System.exit(0);        
    }
    
    public static long getDifDates(Calendar startDate, Calendar endDate) {        
        long totalsegs;
        long end = endDate.getTimeInMillis();
        long start = startDate.getTimeInMillis();
        totalsegs = TimeUnit.MILLISECONDS.toSeconds(Math.abs(end - start));
        return totalsegs;
    }
}
