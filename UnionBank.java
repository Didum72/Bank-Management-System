package Log_Reg;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UnionBank implements TheBank{
    String first_name;
    String last_name;
    String pin;
    String acc_type;
    int acc_no;
    double balance;
    UnionBank ub=new UnionBank();
    UnionBank(){
    }
    UnionBank(String first_name, String last_name, String acc_type, int acc_no, String pin, double balance){
        this.first_name=first_name;
        this.last_name=last_name;
        this.acc_type=acc_type;
        this.acc_no=acc_no;
        this.pin=pin;
        this.balance=balance;

//        System.out.println("Enter your choice:\n1. Withdraw money\n2. Deposite money\n3. Check balance");
    }

    public void withDraw(long amount){
        if(balance>amount){
            balance-=amount;
            System.out.println("Remaining balance in your account is: " + balance);
        }
        else
            System.out.println("Your balance is less than " + amount + "Transaction Failed!!!");
    }

    public void deposit(long amount){
        balance+=amount;
        System.out.println("Your current balance is: " + balance);
    }

    public double getBalance(){
        System.out.println("Your current balance is: ");
        return balance;
    }

    public void showAccDtl(){
        System.out.println("Welcome to Union Bank ");
        System.out.println("Account holder's name: " + first_name + last_name);
        System.out.println("Account type: " + acc_type);
        System.out.println("Account number: " + acc_no);
        System.out.println("Current balance in account: " + balance);
    }
    public boolean search(int accno) {
        if (acc_no == accno) {
            showAccDtl();
            return (true);
        }
        return (false);
    }
}
