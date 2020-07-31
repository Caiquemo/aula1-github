/*
Construir um programa para identiﬁcar quantos dias há em um mês, sabendo o mês e o ano.
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase4 {

    public static Scanner sc = new Scanner(System.in);

    public static int numEntrada() {
        int num = sc.nextInt();
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Digite o número do mês: ");
        int mes = numEntrada();
        System.out.println("Digite o ano: ");
        int ano = numEntrada();
        int opcao = 1;
        switch (opcao) {
            case 1:
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    System.out.print("O mês " + mes + " tem 31 dias");
                    break;
                }
            case 2:
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    System.out.print("O mês " + mes + " tem 30 dias");
                    break;
                }

            case 3:
                if (mes == 2) {
                    if (ano % 4 == 0) {
                        System.out.print("O mês " + mes + " tem 29 dias");
                    } else {
                        System.out.print("O mês " + mes + " tem 28 dias");
                    }
                    break;
                }

            default:
                System.out.print("O mês informado não existe");
        }
    }
}
