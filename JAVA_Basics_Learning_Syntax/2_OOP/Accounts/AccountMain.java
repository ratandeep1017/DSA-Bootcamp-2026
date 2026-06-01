package Accounts;

public class AccountMain {
    public static void main(String[] args) {
        Account Acc1 = new Account();

        Acc1.set_name("Frank Junior ");
        Acc1.set_balance(800.0);
        System.out.println("Name Of Account Owner Is : " + Acc1.get_name());
        System.out.println(Acc1.get_balance());
        System.out.println();
        // success withdrawal
        Acc1.withdraw(500.0);
        //unsuccessful  withdrawal
        Acc1.withdraw(500.0);
        // success-full deposit
        Acc1.deposit_online(199.98);
        //unsuccessful  deposit
        Acc1.deposit_online(9999.98);

        System.out.println(Acc1.get_balance());

//        if (Acc1.deposit_cash(50000))
//        {
//            System.out.println("Deposit Completed");
//            System.out.println("Total Balance In The Account of " + Acc1.get_name() + "'s is $" + Acc1.get_balance() );
//        }
//        else
//            System.out.println("\n----DEPOSIT----ERROR----\nDeposit Balance Reaches Its Limits, Which is $5000\n\n");

    }
}