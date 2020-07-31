/*
 Criar um programa para identiﬁcar se um dia da semana (numerados de 1 a 7) é dia de semana, ﬁm de semana ou um dia inválido. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase6 {

    public static Scanner sc = new Scanner(System.in);

    public static int entradaNum() {
        System.out.println("Digite o número da semana: ");
        int dia = sc.nextInt();
        return dia;
    }

    public static void main(String[] args) {
        int diasemana = entradaNum();
        switch (diasemana) {
            case 1: System.out.print("Fim de semana - Domingo");
            break;
        
            case 2: System.out.print("Dia de semana - Segunda feira");
            break;
            
            case 3: System.out.print("Dia de semana - Terça feira");
            break;
                
            case 4: System.out.print("Dia de semana - Quarta feira");
            break;
            
            case 5: System.out.print("Dia de semana - Quinta feira");
            break;
            
            case 6: System.out.print("Dia de semana - Sexta feira");
            break;
            
            case 7: System.out.print("Fim de semana - Sábado");
            break;
            
            default: System.out.println("Dia inválido");
            
        }
    }

}
