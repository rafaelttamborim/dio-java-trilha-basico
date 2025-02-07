import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {    
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner dados = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua conta!");
        int numero = dados.nextInt();
        
        System.out.println("Digite sua agência!");
        String agencia = dados.next();

        System.out.println("Digite seu nome!");
        String nomeCliente = dados.next();

        System.out.println("Digite o saldo em conta!");
        Double saldo = dados.nextDouble();

        System.out.println("Olá, " + nomeCliente 
        + " obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + " ,conta " + numero + " e seu saldo de R$" + saldo + " está disponivel para saque.");

        System.out.println("Deseja fazer um novo deposito?");
            String deposito = dados.next();

                if (deposito.equals("Sim") || deposito.equals("sim") ) {
                    System.out.println("Qual o valor do deposito?");
                    double valorDeposito = dados.nextDouble();
                    double saldoTotal = saldo + valorDeposito;
                    System.out.println("Seu novo saldo é: R$" +saldoTotal);
                }
                System.out.println("Obrigado por utilizar nosso banco");
        
    }

}
