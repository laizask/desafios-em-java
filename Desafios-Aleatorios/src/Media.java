// Escrever um programa em java que leia o nome de um aluno e as notas das três provas que 
// ele obteve no semestre, no final informar o nome do aluno e a sua média aritmética.
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.next();

        System.out.println("Digite a nota obtidas nas provas semestrais: ");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        int somaNotas = nota1 + nota2 + nota3;
        double mediaAritmetica = somaNotas / 3;

        scanner.close();
        System.out.println("A média do aluno" + nomeAluno + mediaAritmetica);
        
    }
    
}
