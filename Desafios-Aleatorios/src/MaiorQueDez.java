// Faça um programa em java que receba um número e mostre uma mensagem caso este número seja maior que 10.
import java.util.Scanner;

public class MaiorQueDez {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("O número digitado é maior que 10");
        } else {
            System.out.println("Número não é maior que 10");
        };
        scanner.close();
    }
}
