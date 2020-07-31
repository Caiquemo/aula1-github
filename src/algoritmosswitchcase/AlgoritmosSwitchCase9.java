/*
Crie um programa para validar CPF(o usuário informa os onze dígitos do documento e ele informa se o número informado é válido ou não).
Um CPF é composto de 11 dígitos, em que os dois últimos são os dígitos veriﬁcadores. 
Para ser válido, o primeiro e o segundo dígitos do CPF informado devem ser iguais a determinados valores, como descrito abaixo.  

 */
package algoritmosswitchcase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class AlgoritmosSwitchCase9 {

    public static Scanner sc = new Scanner(System.in);

    public static String entradaNumCpf() {
        System.out.println("Digite o CPF para verificar se é válido:");
        String n = sc.next();
        return n;
    }

    public static void main(String[] args) {
        int soma = 0;
        int soma2 = 0;
        int peso = 10;
        int peso2 = 11;
        int digito11 = 0;
        int digito10 = 0;
        boolean tst = false;
        boolean tst2 = false;
        String numCpf = entradaNumCpf();
        int opcao = 1;
        switch (opcao) {
            case 1:
                // System.out.println(numCpf.charAt(0));
                try {
                    System.out.println("");
                    for (int i = 0; i < 9; i++) {
                        int num = (int) (numCpf.charAt(i) - 48);
                        soma = soma + (num * peso);
                        peso = peso - 1; // vai diminuindo a variavel peso que começa com 10

                        // System.out.println(soma);
                    }
                    int aux = 11 - (soma % 11); //Encontre o resto da divisão da soma anterior por 11 
                    //Subtraia o resto obtido no passo anterior de 11.

                    if (aux == 10 || aux == 11) {
                        digito10 = '0';
                    } else {
                        digito10 = (char) (aux + 48); //converte tabela ascii para Int no caso 0
                    }

                    if (aux < 10) {
                        //System.out.println(aux);
                        if (digito10 == numCpf.charAt(9)) {
                            //System.out.println(digito10);
                            tst = true;
                            // System.out.println("estou funcionando");
                        }
                    }

                    for (int i = 0; i < 10; i++) {
                        int num2 = (int) (numCpf.charAt(i) - 48);
                        soma2 = soma2 + (num2 * peso);
                        peso2 = peso2 - 1;
                    }

                    soma2 = 11 - (soma2 % 11);

                    if (soma2 == 10 || soma2 == 11) {
                        digito11 = '0';
                    } else {
                        digito11 = (char) (soma2 + 48);//converte tabela ascii para Int no caso 0
                    }
                    // System.out.println(soma2);
                    if (soma2 < 10) {
                        if (digito11 == numCpf.charAt(10)) {
                            //  System.out.println("CPF válido");
                        }
                    } else if (soma2 > 10) {
                        //System.out.println("tst");
                        if (digito11 == numCpf.charAt(0)) {
                            tst2 = true;
                            //System.out.println("tst");
                        }
                    }

                    if (tst2 || tst == true) {
                        System.out.println("CPF válido");
                    } else {
                        System.out.println("CPF inválido");
                    }

                } catch (InputMismatchException erro) {

                }
        }
    }
}
