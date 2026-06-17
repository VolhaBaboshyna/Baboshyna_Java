package by.homework.lessons.Task16;

import java.util.HashSet;
import java.util.Set;

public class Bank extends Account {

    private Set<Account> accounts;

    public Bank() {
        super();
        this.accounts = new HashSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account from = findAccount(accountNumberFrom);
        Account to = findAccount(accountNumberTo);
        if (from == null || to == null) {
            AccountNotFoundException exception = new AccountNotFoundException();
            exception.setErrorCode("not.found.account");
            throw exception;
        }
        if (from.getSum() < amount) {
            NotEnoughMoneyException exception = new NotEnoughMoneyException();
            exception.setErrorCode("not.enough.money");
            throw exception;
        }
        from.setSum(from.getSum() - amount);
        to.setSum(to.getSum() + amount);
    }

    public void transferMoneyBU(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        Account from = findAccount(accountNumberFrom);
        Account to = findAccount(accountNumberTo);
        if (from == null || to == null) {
            AccountNotFoundException exception = new AccountNotFoundException();
            exception.setErrorCode("Copy string literal text to the clipboard");
            throw exception;
        }
        if (from.getCurrency().equals("USD") || to.getCurrency().equals("BYN")) {
            if ((from.getSum() * exchangeRate) < amount) {
                NotEnoughMoneyException exception = new NotEnoughMoneyException();
                exception.setErrorCode("not.enough.money");
                throw exception;
            }
        } else if (from.getCurrency().equals("BYN") || to.getCurrency().equals("USD")) {
            if (from.getSum() < amount) {
                NotEnoughMoneyException exception = new NotEnoughMoneyException();
                exception.setErrorCode("not.enough.money");
                throw exception;
            }
        }
        if (from.getCurrency().equals("USD") || to.getCurrency().equals("BYN")) {
            from.setSum(from.getSum() - (amount / exchangeRate));
            to.setSum(to.getSum() + amount);
        }
        if (from.getCurrency().equals("BYN") || to.getCurrency().equals("USD")) {
            from.setSum(from.getSum() - amount);
            to.setSum(to.getSum() + (amount / exchangeRate));
        }

    }
}