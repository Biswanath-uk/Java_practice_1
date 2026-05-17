package EX_10_05_2026_String;

public class StringBufferAndBuilder1 {
    public static void main(String[] args) {
        String name = "Biswanath chandra";
        System.out.println(name.replace(" ",""));

        StringBuffer name2 = new StringBuffer(name.replace(" ",""));
        System.out.println(name2.reverse());


//        StringBuffer stringBuffer = new StringBuffer(name);
//        System.out.println(stringBuffer.reverse());
//
//
//        String name1 = "Biswanath chandra";
//
//        System.out.println(name1.trim());




        System.out.println();


    }
}
