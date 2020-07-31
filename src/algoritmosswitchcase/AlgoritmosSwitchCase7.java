/*
Criar um programa para identiﬁcar o valor a ser pago por um plano de saúde dada a idade do conveniado, considerando
que todos pagam R$ 100 mais um adicional conforme a seguinte tabela: 
1) crianças com menos de 10 anos pagam R$80; 
2) conveniados com idade entre 10 e 30 anos pagam R$50; 
3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e 
4) conveniados com mais de 60 anos pagam R$130. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase7 {

    public static Scanner sc = new Scanner(System.in);

    public static int entradaNumeroInt() {
        System.out.println("Digite a sua idade: ");
        int n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int idade = entradaNumeroInt();
        int opcao = 1;
        switch (opcao) {
            case 1:
                if (idade < 10) {
                    System.out.println("180,00");

                }
            case 2:
                if (idade == 10 || idade <= 39) {
                    System.out.println("150,00");

                }
            case 3:
                if (idade > 39 && idade < 60) {
                    System.out.println("195,00");

                }
            case 4:
                if (idade > 60) {
                    System.out.println("130,00");

                }
        }
    }
}
