package EX_17_05_2026_Array;

import java.util.Scanner;

public class Lab130_InputFromTheUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[]numbers = new int [size];

        for (int i = 0 ; i<size; i++ ){
            System.out.println("Enter the number");
            numbers [i] = sc.nextInt();

        }

        System.out.println("-------");

        //Print the numbers enterd by the users

        System.out.println("The number are :");
        for (int i = 0;i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
