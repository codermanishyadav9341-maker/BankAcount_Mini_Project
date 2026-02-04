package Banking_Mini_Project;

class SavingAccount extends Account{
     double interestRate;

     SavingAccount(double balance,double interestRate){
         super(balance);
         this.interestRate = interestRate;
     }

     public void Interest(){
         double interest = balance * interestRate/100;
         balance = balance + interest;
         System.out.println("Interest Added:- " +balance);
     }
}

