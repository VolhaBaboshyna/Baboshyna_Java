package by.homework.lessons.Task16;

import java.util.Set;

public class Bank extends Account {

    Set<Account> accounts;

    public Bank(int id, String accountNumber, String currency, double sum, Set<Account> accounts) {
        super(id, accountNumber, currency, sum);
        this.accounts = accounts;
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumberFrom) {
                double newSumFrom = account.getSum() - amount;
                account.setSum(newSumFrom);
            }
            if (account.getAccountNumber() == accountNumberTo) {
                double newSumTo = account.getSum() - amount;
                account.setSum(newSumTo);
            }
            try
        }
    }

}
