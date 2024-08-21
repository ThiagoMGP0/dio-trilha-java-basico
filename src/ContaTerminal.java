import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite a agência do banco");
        String agencia = scanner.next();

        System.out.println("Insira o número");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    

    }
}
