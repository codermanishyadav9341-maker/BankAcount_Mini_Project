package Banking_Mini_Project;

class Account {
    double balance;

    Account(double balance){
        if(balance >= 0) {
            this.balance = balance;
        }
         else{
             this.balance = 0;
        }
    }

    public void showBalance(){
        System.out.println("Balance:- " +balance);
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance = balance +amount;
            System.out.println("Deposit Successful");
        }
         else{
             System.out.println("amount Cannot be negative ");
        }
    }
}
