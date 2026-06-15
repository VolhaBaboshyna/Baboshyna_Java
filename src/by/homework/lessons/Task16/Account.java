package by.homework.lessons.Task16;

import java.util.Objects;

public class Account {

    private int id;
    private String accountNumber;
    private String currency;
    private double sum;

    public Account(int id, String accountNumber, String currency, double sum) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double newSumFrom) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }
}
