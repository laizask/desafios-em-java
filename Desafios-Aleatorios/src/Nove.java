// Escreva um programa que leia um número inteiro. 
// Verificar por meio de condição se o valor fornecido está na faixa entre 0 (zero) e 9 (nove). 
// Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”. 
// Caso contrário, apresentar a mensagem “valor inválido”.
import java.util.Scanner;
public class Nove {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        
        if (numeroInteiro > 0 && numeroInteiro < 9) {
            System.out.println("Valor válido!");
        } else {
            System.out.println("Valor inválido!");
        }
        scanner.close();
    }
    
}
