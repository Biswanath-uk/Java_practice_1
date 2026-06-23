package EX_17_05_2026_Array;

import java.util.Scanner;

public class Lab135_2ndArray_EX3 {
    public static void main(String[] args) {
        //Print right triangle with the star
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n =5");
        int n = sc.nextInt();
        for (int i = 0 ;i <n;i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
