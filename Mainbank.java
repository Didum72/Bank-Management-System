package Log_Reg;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Mainbank {
    static int i;
    static String bnk;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
    AccDetails acnt=new AccDetails();
    System.out.println("Welcome to the bank!!");
    System.out.println("Enter your bank name: ");
    System.out.println("1. Union Bank \n 2. SBI Bank \n");
    bnk=sc.next();
    do { System.out.println("Enter your choice: ");
         System.out.println("1. Create a new account \n 2. Login \n 3. Exit");
         i = sc.nextInt();
         switch (i) {
                case 1:
                    acnt.createAcc();
                    break;

                case 2:
                    acnt.login();
                    break;

                case 3:
                    acnt.exit();
                    break;

                default:
                    System.out.println("Wrong input. Please choose again");
         }
        }while (i!=3);
    }

}
