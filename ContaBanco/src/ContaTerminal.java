import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));

        // Solicita o número da agência
        System.out.print("Informe o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();

        // Solicita a agência
        scanner.nextLine();
        System.out.print("Informa a agência: ");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        // Especifica o valor em conta
        double saldo = 500.00;

        // Retorna os dados informados pelo usuário
        System.out.printf("Seja bem vindo Sr. %s, obrigada por criar uma conta em nosso banco.\n", nomeCliente, args);
        System.out.printf("Sua agência é %d, %s. Sua conta foi criada com sucessso. \n", numeroAgencia, agencia);
        System.out.printf("Saldo: R$ %.2f%n", saldo);

        scanner.close();

    }
}
