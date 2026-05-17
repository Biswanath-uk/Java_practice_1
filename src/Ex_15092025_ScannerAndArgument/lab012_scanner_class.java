package Ex_15092025_ScannerAndArgument;

import java.util.Scanner;

public class lab012_scanner_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the Employee");
        String name = scanner.nextLine();
        System.out.println("Age of the Employee");
        int age = scanner.nextInt();
        System.out.println("Salary of the Employee");
        int salary = scanner.nextInt();
        System.out.println("My name is  " + name + "My age is  " + age + "My salary is " + salary);

    }
}
