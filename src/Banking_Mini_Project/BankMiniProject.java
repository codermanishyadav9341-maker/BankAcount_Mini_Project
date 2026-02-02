package Banking_Mini_Project;

import Banking_Mini_Project.*;
import java.util.Scanner;

 class BankMiniProject {

     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);


         System.out.println("Select Your Account");
         System.out.println("1.SavingAccount");
         System.out.println("2.CurrentAccount");
         int choice = scan.nextInt();

         if(choice == 1){
             System.out.println("Enter your Initial Amount");
             double bal = scan.nextDouble();

             System.out.println("Enter your InterestRate(0.05 for 5%)");
             double rate = scan.nextDouble();

             SavingAccount save = new SavingAccount(bal,rate);

             while(true) {
                 System.out.println("---------=SavingAccount Menu=---------");
                 System.out.println("1.Show_Balance");
                 System.out.println("2.Deposit");
                 System.out.println("3.Add_Interest");
                 System.out.println("4.Exit");

                 int ch = scan.nextInt();

                 switch (ch){

                     case 1:
                         save.showBalance();
                         break;

                     case 2:
                         System.out.println("Enter your amount");
                         save.deposit(scan.nextDouble());
                         break;

                     case 3:
                         save.Interest();
                         break;

                     case 4:
                         System.out.println("Thank You");
                         break;

                     default:
                         System.out.println("Invalid Choice");

                 }
             }


         }
          else if(choice == 2){

              System.out.println("Enter your Initial Balance:- ");
              double bal = scan.nextDouble();

              System.out.println("OverDraftLimit Transactions:- ");
              double over = scan.nextDouble();

              CurrentAccount cc = new CurrentAccount(bal,over);

              while(true){

                 System.out.println("-------------=Current Account Menu=----------------");
                 System.out.println("1.Show Balance");
                 System.out.println("2.Deposit");
                 System.out.println("3.WithDraw");
                 System.out.println("4.Exit");

                 int ch = scan.nextInt();

                 switch(ch){

                     case 1:
                         cc.showBalance();
                         break;

                     case 2:
                         System.out.println("Enter Amount");
                         cc.deposit(scan.nextDouble());
                         break;

                     case 3:
                         System.out.println("Enter Amount");
                         cc.WithDraw(scan.nextDouble());
                         break;

                     case 4:
                         System.out.println("Thank You");
                         break;

                     default:
                         System.out.println("InValid Options");

                 }
              }
         }
           else{
               System.out.println("Invalid Account Type");
         }
     }
}
