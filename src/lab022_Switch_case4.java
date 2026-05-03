public class lab022_Switch_case4 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronic gadget");
                break;
                case 004,006,007:
                    System.out.println("This is mech");
                    break;
            default :
                System.out.println("None");
        }
    }
}
