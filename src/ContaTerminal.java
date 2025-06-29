import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da agência:");
        Integer agencia = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite o número da conta:");
        String conta = scanner.nextLine();
        System.out.print("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, conta, saldo);
    }
}
