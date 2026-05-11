package EX_10_05_2026_String;

public class Lab123_StringsEqualsPart2 {
    public static void main(String[] args) {
        String name1 = "Biswanath";
        String name2 = "Biswanath";
        String name3 = new String("Biswanath");
        String name4 = new String("Biswanath");
        String name5 = new String("Biswanath1");

        System.out.println(name1==name5);//False
        System.out.println(name1==name3);//False
        System.out.println(name4==name1);//False
        System.out.println(name1==name2);//False

        //equals (Content ) -> value

        System.out.println(name1.equals(name5));
    }
}
