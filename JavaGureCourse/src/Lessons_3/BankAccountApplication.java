package Lessons_3;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Vasia", 50);
        BankAccount bankAccount1 = new BankAccount("Petia", 150);
        BankAccount bankAccount2 = new BankAccount("tania");
        BankAccount bankAccount3 = new BankAccount();

        System.out.println(bankAccount);
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
        System.out.println(bankAccount3);
    }
}
