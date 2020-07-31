/*
Crie um programa que simule uma calculadora simples capaz de realizar as operações básicas. 
O programa deve receber 3 dados: dois números e um caractere. 
Este caractere poderá ser '+', '-', ‘*' ou '/' , e representarão a operação matemática que você deseja realizar entre os números. 
 */
package algoritmosswitchcase;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase10 {

    public static Scanner sc = new Scanner(System.in);

    public static double numEntrada() {
        double n;
        n = sc.nextDouble();
        return n;
    }

    public static char operacao() {
        char op;
        System.out.println("Digite a operação desejada");
        op = sc.next().charAt(0);
        return op;
    }

    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        double n1 = numEntrada();

        System.out.println("Digite o segundo número: ");
        double n2 = numEntrada();
        
        System.out.println(" + - * / ");
        char operacao = operacao();

        switch (operacao) {
            case '+': {
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            }
            case '-': {
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            }
            case '*': {
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            }
            case '/': {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            }
        }

    }
}
