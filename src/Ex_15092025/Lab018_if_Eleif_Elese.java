package Ex_15092025;

import java.util.Scanner;

public class Lab018_if_Eleif_Elese {
    public static void main(String[] args) {
        //Condition - 2 out puts,
        //Can we have two or more outputs?
//        int num1 = 30;
//        int num2 = 20;
//        //1 -> num1 > num2
//        //2 -> num2 > num1
//        //3 -> num1 == num2
//        if (num1>num2){
//            System.out.println("num1 is gater than num2 ");
//        }
//        else if (num2<num1)
//        {
//            System.out.println("num2 is gater than num1");
//        }
//        else {
//            System.out.println("Equal both");
//        }

        //Using with taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        if (num1>num2)
        {
            System.out.println("Enter num1 ");
        }
        else if (num2>num1)
        {
            System.out.println("Enter the num2");
        }
        else {
            System.out.println("Both are equal");
            }
        sc.close();
    }
}
