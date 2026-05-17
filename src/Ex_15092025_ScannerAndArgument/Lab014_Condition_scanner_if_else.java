package Ex_15092025_ScannerAndArgument;

import java.util.Scanner;

public class Lab014_Condition_scanner_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        if (age1>18){
            System.out.println("Allow to vote");
        }
        else {
            System.out.println("Not allowed to vote");
        }
        sc.close();

    }
}
