package EX_10_05_2026_String;

public class Lab125_String_Builder_Buffer {
    public static void main(String[] args) {

//
        StringBuffer stringBuffer = new StringBuffer("Biswanath"); // Thread safe
        stringBuffer.append("Chandra");
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Biswanath"); //Not thread safe
        stringBuilder.append("Chandra");
        System.out.println(stringBuilder);
    }
}
