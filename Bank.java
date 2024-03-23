import java.util.*;

public class Bank {
    String name;
    String AccNum;
    double balance = 0.00;
    double credit;
    double debit;
    
    static Scanner sc = new Scanner(System.in);

    public Bank(String customerName , String customerAcc){
        name = customerName;
        AccNum = customerAcc;
    }

    public void getData(){
        System.out.println("Welcome " + name);
        System.out.println("Account Number " + AccNum);
        System.out.println("Current Balnce : ");
        viewBalance();
    }

    public void password(){
        int pin = 1234;
        int getpass;
        System.out.println("Please enter 4 digit pin for login : ");
        getpass = sc.nextInt();
        if(getpass == pin){
            System.out.println("Login Successfull !!");
        } else {
            System.out.println("Incorrect Pin");
            System.exit(0);
        }
    }

    public void viewBalance() {
        System.out.println(balance);
    }

    public void Debit(){
        double debitAmount;
        System.out.println("Enter the Amount you want to Debit : ");
        debitAmount = sc.nextDouble();
        if(debitAmount > balance){
            System.out.println("Insufficient Funds ");
        }
        else {
            System.out.println("Amount Debited Successfully");
            balance -= debitAmount;
        }
    }

    public void Credit(){
        int creditAmount;
        System.out.println("Enter the Amount you want to Credit");
        creditAmount = sc.nextInt();
        balance += creditAmount;
    }

    public static void main(String[] args) {
        String name , account;
        System.out.println("Enter Your name : ");
        name = sc.nextLine();
        System.out.println("Enter Your Account Number : ");
        account = sc.nextLine();
        Bank b = new Bank(name, account);
        b.password();
        b.getData();
        int choice = -1;
        while(choice != 4){
            System.out.println("Choose one of the below Option : ");
            System.out.println("1) Add money to bank account");
            System.out.println("2) Withdraw Money from account");
            System.out.println("3) Check Account Balance");
            System.out.println("4) Exit Program");
            System.out.println("Please Enter Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b.Credit();
                    break;

                case 2:
                    b.Debit();
                    b.viewBalance();
                    break;
                    
                case 3:
                    b.viewBalance();
                    break;
                

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
