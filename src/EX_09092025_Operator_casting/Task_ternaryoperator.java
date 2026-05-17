package EX_09092025_Operator_casting;

public class Task_ternaryoperator {
    public static void main(String[] args) {
        //Find the maximum number between two
        int a = 2;
                int b= 10 ;
                String c = (a>b ? "maximum a" : "maximum b" );
                int x = a>b ? a :b ;
        System.out.println(c);
        System.out.println(x);
    }
}
