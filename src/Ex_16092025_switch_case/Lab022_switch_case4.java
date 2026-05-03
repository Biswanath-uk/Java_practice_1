package Ex_16092025_switch_case;

public class Lab022_switch_case4 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode){
            //There are two way to use the switch case
            //1. switch ()
            //      case value :
            //          break;

            // 2. switch ()
            //case value  ->
            case 001  -> System.out.println("All of them are electronic gadget");
            case 002 ->  System.out.println("This is mech");
            default ->   System.out.println("None");

        }
    }
}
