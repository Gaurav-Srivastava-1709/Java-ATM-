package atmmachine;
import java.util.*;

class Atm{
    int balance=100000;
    String userid="abcd",pin="4567";
    public void checkpin()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print(" Enter user id  :  ");
        String id= sc.nextLine();
        System.out.print(" Enter user pin :  ");
        String enteredpin = sc.nextLine();
        
        if (id.equals(userid) && enteredpin.equals(pin))
        {
            System.out.println(" Login Successfully...");
            menu();
        }
        else
        {
            System.out.println(" Enter a valid pin");
        }
    }
    public void menu()
    {
        while(true)
        {
            System.out.println(" ");
            System.out.println("   ATM INTERFACE   ");
            System.out.println("1. Check Your Balance ");
            System.out.println("2. Withdraw  ");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter Your Choice : ");
            
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Enter a valid choice"); 
                    
            }
            
        }
    }
    
    public void checkBalance()
    {
        System.out.println("Balance :"+balance);
        menu();
    }
    
    public void withdrawMoney()
    {
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount>balance)
        {
            System.out.println("Insufficient Balance...!");
        }
        else
        {
            balance=balance=amount;
            System.out.println("Withdraw Successfully...");
        }
        menu();
    }
    
    public void depositMoney()
    {
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();
        balance= balance+ amount;
        System.out.println("Money Deposited Successfully...");
    }
}
        

public class ATMMachine {
    public static void main(String[] args) {
        
        Atm atm = new Atm();
        atm.checkpin();
    }
}
