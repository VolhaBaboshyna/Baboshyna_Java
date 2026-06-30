package by.homework.lessons.Task16;

public class Main {

    public static void main(String[] args) throws Exception {
        Account account1 = new Account(1, "AAA111", "BYN", 1000);
        Account account2 = new Account(2, "AAA112", "BYN", 200);
        Account account3 = new Account(3, "AAA113", "BYN", 50);
        Account account4 = new Account(4, "AAA124", "BYN", 400);
        Account account5 = new Account(5, "AAA125", "BYN", 100);
        Account account6 = new Account(6, "AAA126", "USD", 100);

        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);
        bank.addAccount(account6);

//        System.out.println(account1);
//        System.out.println(account2);

//        try {
//            bank.transferMoney("AAA110", "AAA112", 100.0);
//        } catch (AccountNotFoundException e) {
//            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("Недостаточно средств для перевода");
//        } finally {
//            System.out.println("Спасибо, что воспользовались услугами банка");
//        }

        System.out.println(account5);
        System.out.println(account6);

        try {
            bank.transferMoneyBU("AAA125", "AAA126", 100.0, 2);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }

        System.out.println(account5);
        System.out.println(account6);
    }
}
