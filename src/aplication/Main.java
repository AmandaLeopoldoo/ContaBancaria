/*Fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char deposito = sc.next().charAt(0);

        Account account;

        if (deposito == 'y'|| deposito == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            account = new Account(numeroConta, nome, depositoInicial);
        }
        else {
            account = new Account(numeroConta, nome);
        }

        System.out.println();

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposito(depositValue);

        System.out.println();

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter withdraw value: ");
        double saqueValue = sc.nextDouble();
        account.saque(saqueValue);
        System.out.println("Update account data:");
        System.out.println(account);

        sc.close();
    }
}