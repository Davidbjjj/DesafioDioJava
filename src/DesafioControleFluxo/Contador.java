package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numeroUm = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int numeroDois = sc.nextInt();

        try {
            contar(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }

    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {

        if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException();
        }

        for (int contagem=numeroUm;contagem <=numeroDois; contagem++ ){
            System.out.println(contagem);

        }

    }
}

