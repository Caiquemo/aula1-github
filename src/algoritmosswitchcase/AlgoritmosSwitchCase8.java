/*
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma associação.
A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (com juros sobre juros). Por exemplo, uma associação
de R$100 paga em janeiro, custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro, R$171,03. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase8 {

    public static Scanner sc = new Scanner(System.in);

    public static int digitoMes() {
        System.out.println("Digite o número referente ao mês");
        int m = sc.nextInt();
        return m;
    }

    public static double digitoValor() {
        System.out.println("Digite o valor da multa");
        double mv = sc.nextDouble();
        return mv;
    }

    public static void main(String[] args) {
        int mes = digitoMes();
        double multa = digitoValor();

        switch (mes) {
            case 1:
                System.out.print(multa);

            case 2:
                System.out.println(multa * Math.pow(1 + 0.05, 1));

            case 3:
                System.out.println(multa * Math.pow(1 + 0.05, 2));

            case 4:
                System.out.println(multa * Math.pow(1 + 0.05, 3));

            case 5:
                System.out.println(multa * Math.pow(1 + 0.05, 4));

            case 6:
                System.out.println(multa * Math.pow(1 + 0.05, 5));

            case 7:
                System.out.println(multa * Math.pow(1 + 0.05, 6));

            case 8:
                System.out.println(multa * Math.pow(1 + 0.05, 7));

            case 9:
                System.out.println(multa * Math.pow(1 + 0.05, 8));

            case 10:
                System.out.println(multa * Math.pow(1 + 0.05, 9));

            case 11:
                System.out.println(multa * Math.pow(1 + 0.05, 10));

            case 12:
                System.out.println(multa * Math.pow(1 + 0.05, 11));
                break;
            default:
                System.out.println(multa * Math.pow(1 + 0.05, mes));
        }

    }

}
