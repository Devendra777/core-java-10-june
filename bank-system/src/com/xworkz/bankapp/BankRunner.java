package com.xworkz.bankapp;


import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.fdaccount.FdAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {


    public static void main(String[] args) {
        System.out.println("main started");

          SavingsAccount devsAccount = new SavingsAccount();

        devsAccount.credit(10200);
      System.out.println("The closing Balance is "+devsAccount.getBalance()) ;


        SavingsAccount shettysAccount = new SavingsAccount();


        devsAccount.tranfer(shettysAccount , 1200);

        System.out.println("main ended");
    }
}
