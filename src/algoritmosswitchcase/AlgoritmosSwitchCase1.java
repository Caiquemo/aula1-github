/*
 Crie um programa que veriﬁca se um número inteiro informado pelo usuário é divisível por 3. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase1 {

    public static Scanner sc = new Scanner(System.in);

    public static int entradaNum() {
        System.out.println("Digite um inteiro");
        int num = sc.nextInt();
        return num;
    }

    public static void main(String[] args) {
        int opcao = 1;
        int num = entradaNum();
        switch (opcao) {
            case 1:
                if (num % 3 == 0) {
                    System.out.println("É divisivel por 3");
                    break;
                }
            default:
                System.out.println("Não é divisivel.");

        }

    }

}
