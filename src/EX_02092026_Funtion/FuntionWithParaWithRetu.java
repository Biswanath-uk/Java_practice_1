package EX_02092026_Funtion;

public class FuntionWithParaWithRetu {
    public static void main(String[] args) {
        int Sum_of_mum = sum(3,4);
        System.out.println(Sum_of_mum);
        int Sum_of_new = sum1(2, 5);
        System.out.println(Sum_of_new);

String Sum_SEE = Sum2("tes", "jdb");
        System.out.println(Sum_SEE);

        System.out.println(PrintWelcome("java"));
    }
    static int sum (int a,int b){
        System.out.println("Enter the sum of number ");
        return a + b;
    }
    static int sum1 (int a1,int b1){
        return 1100;
    }
    static String Sum2(String a1,String b2 )
    {

                return a1;
    }

    static String PrintWelcome (String name ){
        return "Welcome" + name + "!";
    }
}
