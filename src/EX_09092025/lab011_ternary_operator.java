package EX_09092025;

public class lab011_ternary_operator
{
    public static void main(String[] args) {
       int a = 30,b=50,c=70;
        int maximum =(a>b)? (a>c ? a:c) : (b>c ? b:c);
      System.out.println("Maximum number is" + maximum);

//        int num1 = 10, num2 = 20, num3 = 15;
//
//        // Using nested ternary operator
//        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
//
//        System.out.println("The maximum number is: " + max);
    }
}
