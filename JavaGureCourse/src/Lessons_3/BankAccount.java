package Lessons_3;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public BankAccount() {
    }

    public BankAccount(String owner) {
        this.owner = owner;

    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    @Override
    public String toString() {
        return "Владелец - " + this.owner + " \n"
                + "Сумма - " + this.money;
    }
}
