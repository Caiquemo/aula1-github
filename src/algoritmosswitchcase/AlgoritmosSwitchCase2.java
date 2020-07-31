/*
Crie um programa que exibe se um dia é dia útil, ﬁm de semana ou dia inválido dado o número referente ao dia. 
Considere que domingo é o dia 1 e sábado é o dia 7. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase2 {

    public static Scanner sc = new Scanner(System.in);

    public static int entradaNum() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        return num;
    }

    public static void main(String[] args) {
        int numero=entradaNum();
        
        switch (numero) {
            case 1: 
                System.out.println("DOMINGO");
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("SEGUNDA");
                System.out.println("Dia Util");
                break;
            case 3:
                System.out.println("TERÇA");
                System.out.println("Dia Util");
                break;
            case 4:
                System.out.println("QUARTA-FEIRA");
                System.out.println("Dia Util");
                break;
            case 5:
                System.out.println("QUINTA-FEIRA");
                System.out.println("Dia Util");
                break;
            case 6:
                System.out.println("SEXTA-FEIRA");
                System.out.println("Dia Util");
            case 7:
                System.out.println("SÁBADO");
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }
        
    }
}
