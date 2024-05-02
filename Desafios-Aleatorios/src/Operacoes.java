// Faça um programa  em java que receba dois números e ao final mostre a 
// soma, subtração, multiplicação e a divisão dos dois números lidos.

import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        scanner.close();

        System.out.println("A soma dos valores é: " + soma + ". A subtração dos valores é: " + subtracao + ". A multiplicacao dos valores é: " + multiplicacao + ". A divisao dos valores é: " + divisao);




    }
    
}
