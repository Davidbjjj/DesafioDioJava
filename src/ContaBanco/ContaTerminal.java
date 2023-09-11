package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int numero=0;
        String agencia;
        String nomeCliente;


        System.out.println("Digite seu numero");
        numero= sc.nextInt();

        System.out.println("Digite sua agencia");
        agencia= sc.next();

        System.out.println("Digite seu Nome");
        nomeCliente= sc.next();

        System.out.println("Digite seu saldo");
        double saldo = sc.nextDouble();


        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");


    }
}
