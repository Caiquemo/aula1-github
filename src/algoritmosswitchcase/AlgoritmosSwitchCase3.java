
/*
Crie um programa para informar quais e quantas notas são necessárias para entregar o mínimo de cédulas para um determinado 
valor informado pelo usuário, Considere notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve mostrar apenas as notas utilizadas. 
Por exemplo, ao solicitar R$18, o programa deve informar apenas a seguinte informação (note que não foram exibidas informações sobre as demais cédulas):   
1 nota(s) de R$ 10. 1 nota(s) de R$ 5. 3 nota(s) de R$ 1. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase3 {

    public static Scanner sc = new Scanner(System.in);

    public static int entradaNum() {
        System.out.println("Digite o valor desejado");
        int din = sc.nextInt();
        return din;
    }

    public static void main(String[] args) {
        int dinheiro = entradaNum();

        int notas100 = 0;
        int notas50 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas1 = 0;

        int opcao = 1;
        switch (opcao) {
            case 1:
                if (dinheiro > 99) {
                    notas100 = dinheiro / 100;
                    dinheiro = dinheiro % 100; //divide por 100 e guarda o resto na variável dinheiro.
                    System.out.println(notas100 + " nota(s) de R$ 100");
                }

            case 2:
                if (dinheiro > 49) {
                    notas50 = dinheiro / 50;
                    dinheiro = dinheiro % 50;
                    System.out.println(notas50 + " nota(s) de R$ 50");

                }
            case 3:
                if (dinheiro > 9) {
                    notas10 = dinheiro / 10;
                    dinheiro = dinheiro % 10;
                    System.out.println(notas10 + " nota(s) de R$ 10");

                }

            case 4:
                if (dinheiro > 4) {
                    notas5 = dinheiro / 5;
                    dinheiro = dinheiro % 5;
                    System.out.println(notas5 + " nota(s) de R$ 5");

                }

            case 5:
                if (dinheiro > 0) {
                    notas1 = dinheiro / 1;
                    dinheiro = dinheiro % 1;
                    System.out.println(notas1 + " nota(s) de R$ 1");

                }
        }
    }
}
