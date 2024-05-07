import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da agência desejada:");
        String agencia = in.nextLine();

        int conta = new Random().nextInt(10000);

        System.out.println("Por favor, digite o seu nome e sobrenome:");
        String nomeCliente = in.nextLine();

        System.out.println("Quanto você quer depositar para abertura de sua conta?");
        double saldo = in.nextDouble();

        //Exibir a mensagem conta criada
        String mensagem = String.format("Olá, %s! Obrigado por abrir sua conta em nosso banco. Seu saldo de R$%.2f já está disponível para saque e seus dados são: \nAgência: %s \nConta: %04d", nomeCliente, saldo, agencia, conta);
        System.out.println(mensagem);

        in.close();
    }
}
