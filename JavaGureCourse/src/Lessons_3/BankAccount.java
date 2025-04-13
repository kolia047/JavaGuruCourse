package Lessons_3;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    BankAccount() {
    }

    public BankAccount(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Владелец - " + this.owner + " \n"
                + "Сумма - " + this.money;
    }
}
