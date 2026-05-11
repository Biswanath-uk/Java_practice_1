package EX_10_05_2026_String;

public class Lab121_String2 {
    public static void main(String[] args) {
//String constant pool
String name1 = "Biswanath";
 name1 = "Biswa";
 name1 = "Biswachandra";
        System.out.println(name1);

 //String ->Data type
// name1 -> Reffarels
// = -> Assigment operator
//"Biswanath" -> Literal(String)

//Using Heap area

 String name2 = new String("Chandra");
 String name3 = new String("Biswanath2");
 String name4 = name2;
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

    }
}
