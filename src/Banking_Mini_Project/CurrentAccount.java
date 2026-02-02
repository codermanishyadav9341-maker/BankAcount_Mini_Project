package Banking_Mini_Project;

import Banking_Mini_Project.Account.*;
public class CurrentAccount extends Account {
    double overDraftLimit;

    CurrentAccount(double balance,double overDraftLimit){
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    public void WithDraw(double amount){
        if(balance + overDraftLimit >= amount){
            balance = balance - amount;
            System.out.println("WithDraw Successful ");
            System.out.println("Remaining Balance:- " +balance);
        }
         else{
             System.out.println(" Overflow Transactions failed");
        }
    }
}
