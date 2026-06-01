package Accounts;

public class Account {

    private String name;
    double total_balance = 0.00;

    public String get_name() {
        return name;
    }

    void set_name(String name) {
        this.name = name;
    }

    void set_balance(double bal) {
        total_balance = bal;
    }

    double get_balance() {
        System.out.print("Total balance in " + name + "'s Account is $");
        return total_balance;
    }

    void deposit_online(double bal) {
        System.out.println("\nIn Deposit.... $" + bal);
        if (bal <= 5000) {
            total_balance = total_balance + bal;
            System.out.println("Deposit Completed");
            System.out.println(get_balance());
        } else
            System.out.println("DEPOSIT----ERROR\nDeposit Balance Reaches Its Limits, Which is $5000\n");
    }

    void withdraw(double bal) {
        System.out.println("\nIn Withdrawal.... $" + bal);
        if (total_balance - bal >= 0) {
            total_balance = total_balance - bal;
            System.out.println("Withdrawal Completed");
            System.out.println(get_balance());
        } else
            System.out.println("WITHDRAWAL----ERROR\n" + "can't withdraw $" + bal + " from $" + total_balance);

    }

//    Boolean deposit_cash(double bal) {
//        System.out.println("In Deposit.... $");
//        if (bal <= 5000) {
//            total_balance = total_balance + bal;
//            return true;
//        } else
//            return false;
//    }


}

