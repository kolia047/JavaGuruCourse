package Lessons_3;

import java.util.Scanner;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Vasia", 50);
        BankAccount bankAccount1 = new BankAccount("Petia", 150);
        BankAccount bankAccount2 = new BankAccount("tania");
        BankAccount bankAccount3 = new BankAccount();

        System.out.println(bankAccount2.getOwner());
        System.out.println(bankAccount1.getMoney());
        System.out.println(bankAccount3.getOwner());


        System.out.println(bankAccount);
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
        System.out.println(bankAccount3);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name");
        String name = scanner.nextLine();
        System.out.println("Your mony");
        int money = scanner.nextInt();
        BankAccount bankAccount4 = new BankAccount(name, money);
        System.out.println(bankAccount4);

    }
}
