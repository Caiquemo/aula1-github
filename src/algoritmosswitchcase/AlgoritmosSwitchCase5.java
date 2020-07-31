/*
Criar um programa para identiﬁcar se um mês digitado pelo usuário é de alta ou baixa temporada 
(considerar os seguintes meses como alta temporada: dezembro a fevereiro, junho e julho). 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase5 {

    public static Scanner sc = new Scanner(System.in);

    public static String entradaMes() {
        System.out.println("Digite o mês para identificar a temporada: ");
        String mes = sc.next();
        return mes;
    }

    public static void main(String[] args) {
        String mes = entradaMes();
        int opcao = 1;
        switch (opcao) {
            case 1:
                if (mes.equals("dezembro") || mes.equals("fevereiro") || mes.equals("junho") || mes.equals("julho")) {
                    System.out.print("Alta temporada");
                    break;
                }
            default: System.out.println("baixa temporada");
        }
    }
}
