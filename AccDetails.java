package Log_Reg;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AccDetails {
    String first_name,last_name,pin,accType;
    int accountNo;
    static int bnk;
    double balance;
    static Scanner sc=new Scanner(System.in);
    static int lastAccNo= 15362479;
    private static ArrayList<AccDetails> accounts=new ArrayList<AccDetails>();
    public AccDetails(){}
    public AccDetails(String first_name,String last_name, int accountNo, String accType, String pin, double balance, int bnk){
        this.first_name=first_name;
        this.last_name=last_name;
        this.accType=accType;
        this.pin=pin;
        this.balance=balance;
        this.accountNo=accountNo;
        this.bnk=bnk;
    }

    public String getFirst_name(){
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    public String getLast_name(){ return last_name;}
    public void setLast_name(String last_name){ this.last_name=last_name;}
    public String getPin(){
        return pin;
    }
    public void setPin(String pin){
        this.pin=pin;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(String AccountNo){
        this.accountNo=accountNo;
    }
    public String getAccType(){
        return accType;
    }
    public void setAcctype(String accType){
        this.accType=accType;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getBnk(){return bnk;}
    public  void setBnk(int bnk){this.bnk=bnk;}
    public static void createAcc(){
        System.out.println("Enter your first name: ");
        String fst_nm=sc.next();
        System.out.println("Enter your last name: ");
        String lst_nm=sc.next();
        System.out.println("Enter account type: ");
        String accTyp=sc.next();
        System.out.println("Enter a 8-digit pin (number only): ");
        String pass= sc.next();
        System.out.println("Re-enter pin to confirm pin: ");
        String pass2=sc.next();
        if(!Objects.equals(pass, pass2)){
            System.out.println("Pin does not match!! Try again.");
        }

        System.out.println("Enter the balance: ");
        double blnc=sc.nextDouble();
        lastAccNo=lastAccNo+1;
        System.out.println("Your account has been created in " + "and your acccount number is: " + lastAccNo);
        AccDetails ac=new AccDetails(fst_nm,lst_nm, lastAccNo, accTyp, pass2, blnc, bnk );
        showMenu(ac);
    }

    public static void login(){
        System.out.println("Enter your account number: ");
        int ac_no=sc.nextInt();
        System.out.println("Enter your pin: ");
        String pswd=sc.next();
        boolean exit= false;
        AccDetails acnt=new AccDetails();
        for (AccDetails ac: accounts) {
            if(ac.getAccountNo()==ac_no && Objects.equals(ac.getPin(), pswd)){
                exit=true;
                acnt=ac;
                exit();
            }
            else{
                System.out.println("invalid account number or wrong pin");
            }
        }
        if(exit) {
            showMenu(acnt);
            System.out.println("This account does not exists");

        }
    }
    public static int exit(){
        System.out.println("Thanks for visiting the bank. You are exiting.");
        return 1;
    }

    public static void showMenu(AccDetails ac){
        System.out.println("Welcome "+ac.getFirst_name()+" "+ac.getLast_name());
    }
}
