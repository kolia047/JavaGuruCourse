package Lessons_3;

class BankAccount {
    private String owner;
    private int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    BankAccount() {
    }

    @Override
    public String toString() {
        return "Владелец - " + this.owner + " \n"
                + "Сумма - " + this.money;
    }
}
