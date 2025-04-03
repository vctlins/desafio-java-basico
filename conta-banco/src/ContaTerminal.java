import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /*numero, agencia, nome cliente, saldo */

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println(gerarMensagem(nomeCliente, agencia, numeroConta, saldo));

        scanner.close();
        
    }

    public static String gerarMensagem(String nomeCliente, String agencia,int conta, double saldo){

        return "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ").concat(String.valueOf(conta))
        .concat(", e seu saldo ").concat(String.valueOf(saldo))
        .concat(" já está disponível para saque.");

    }
}
