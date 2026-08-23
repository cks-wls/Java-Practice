package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 금액 : " + amount);
    }

    void withdraw(int amount) {
        System.out.println("출금 금액 : " + amount);
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void printBalance() {
        System.out.println("잔고 : " + balance);
    }
}
