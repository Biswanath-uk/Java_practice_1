package EX_09092025;

public class lab010_ternary_operator {
    public static void main(String[] args) {
        //- Result = condition ? Expression 1 = Expression 2 ;
        int num = -5 ;
        String result = num>0 ? "Poaetive"  : "Negetive";
        System.out.println(result);

        int age = 19 ;
        String result1 = (age > 18? "Allowed to vote" : "Not allowed to vote");
        System.out.println(result1);
    }
}
