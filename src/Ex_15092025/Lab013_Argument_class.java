package Ex_15092025;



public class Lab013_Argument_class {
    public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a>b ? "Max is a" : "Max is b");
    }
}
