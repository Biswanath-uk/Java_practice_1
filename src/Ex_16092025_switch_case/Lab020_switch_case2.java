package Ex_16092025_switch_case;

import java.util.Scanner;

public class Lab020_switch_case2 {
    public static void main(String[] args) {
        // It will be used in Web automation
        // I will ask user which browser you want me to run the code
        // Chrome -> Execute of firefox
        // edge -> edge browser cases .
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        switch (browser) {
            case "chrome" :
                System.out.println("Starting the chrome");
            break;
            case "firfox" :
                System.out.println("Starting the firefox browser");
                break;
            case "edge" :
                System.out.println("Excecute the Edge Code");
                break;
            default :
                System.out.println("I have not idea which browser is this ");
                break;
        }
    }
}
