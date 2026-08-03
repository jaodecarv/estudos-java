import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Titular: ");
        String holder = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();

        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Digite o valor para saque: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("Novo saldo: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        sc.close();
    }
}

class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance == 0) {
            throw new IllegalArgumentException("Não há saldo disponível para saque.");
        }
        if (amount > withdrawLimit) {
            throw new IllegalArgumentException("O valor excede o limite de saque.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        balance -= amount;
    }
}