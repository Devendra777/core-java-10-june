package com.xworkz.bankapp.bankaccount;

// Parent / Base / Super
public class BankAccount{

            public double balance;
     public double getBalance() {
        return balance;
     }

    public void credit(double amount){
        System.out.println("deposit started");
              if(amount > 0 ) {
                  balance  = balance+ amount;
                  System.out.println("Deposit successfull");
              }
              else System.out.println("Amount cannot be zero");

        System.out.println("deposit ended");
          }

          public  void debit(double amount){
              System.out.println("withDraw started");
              if(amount <= balance) {
                  balance = balance- amount;
                  System.out.println("withDraw successfull");
              }
              else System.out.println("Insufficient Funds");

              System.out.println("end of withDraw");
          }

             //  transfer
             // BankAccount beneficiary  = new SavingsAccount();
         public void tranfer(BankAccount beneficiary , double amount ){
             System.out.println("transfer started");
                this.debit(amount);
             System.out.println("Amount is withDrawn from the account");
                beneficiary.credit(amount);
             System.out.println("amount sent successfull");
             System.out.println("transfer ended");
         }

}
