package EX_10_05_2026_String;

public class Lab122_String3 {
    public static void main(String[] args) {
        String name = "biswanath";
       // name.toUpperCase();
        //System.out.println(name);

        //It should not able to change that to the upper case because the string is immutable

        //But if you want to be fixed it use below mention step
         name = name.toUpperCase();
        System.out.println(name);
    }
}
