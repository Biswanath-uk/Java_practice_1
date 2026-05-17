package EX_10_05_2026_String;

public class Task_01 {
    public static void main(String[] args) {


   String ABK78 = ABK4("Biswanath");
        System.out.println(ABK78);

        }

    public static void ABK2 (String ABK1){
        int size = ABK1.length();
        System.out.println(size);
        for (int i = size-1; i>=0; i-- ){
            //
            System.out.print(ABK1.charAt(i));


        }
        }
    public static String ABK4(String ABK8){
        String ABK90 ="";// "h"
        int size = ABK8.length();
        for (int i = size-1; i>=0; i-- ){
            ABK90 = ABK90 + ABK8.charAt(i);
        }

        return (ABK90);
    }
}
