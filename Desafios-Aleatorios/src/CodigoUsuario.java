// Faça um algoritmo para ler um número que é um código de usuário. 
// Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) 
// deve ser apresentada a mensagem ‘Usuário inválido!’. 
// Caso o Código seja correto, deve ser lido outro valor que é a senha. 
// Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
// Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
import java.util.Scanner;
public class CodigoUsuario {
    public static void main(String[] args) {
        int codigo = 1234;
        int senha = 9999;
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Digite seu código de usuário: ");
        int codigoDigitado = scanner.nextInt();

        if (codigoDigitado == codigo) {
            System.out.println("Digite sua senha: ");
            int senhaUsuario = scanner.nextInt();

            if (senhaUsuario != senha) {
            System.out.println("Senha incorreta");
        } else {
            System.out.println("Acesso Permitido!");
            break;
        } 
    }else {
            System.out.println("Usuário invalido! Tente novamente!");
        }
    }
    scanner.close();
    }
}
