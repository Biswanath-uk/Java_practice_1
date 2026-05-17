package Ex_15092025_ScannerAndArgument;

import java.util.Scanner;

public class lab017_if_else {
    public static void main(String[] args) {
        //Create a program -Take user input
        //Check weather the input is even or odd number
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        //Modulus -> %
        //10%2 == Even ->0
        //10%2 ==Odd -> 1

        if (num%2==0){
            System.out.println("Number is -> even");
        }
        else {
            System.out.println("Num is ->Odd");
        }
scanner.close();
    }
}
