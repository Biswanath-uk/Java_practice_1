package EX_10_05_2026_String;

public class Lab124_RemaningFuntionsForString {
    public static void main(String[] args) {

//Sub String --> Extract a position of the string
        String str = "Biswanath is a bad boy ";
        String part_pof_str = str.substring(11, 15);//SubString (str.substing)-->>(BeginIndex and EndIndex) It should allow the user to find out the character position
        System.out.println(part_pof_str);

        //Concatination -->> Combination of two string
String s1 = "Biswanath";
String s2 = s1.concat("Chandra");
        System.out.println(s2); //Combination of two string through s1.concat

        //OR we can use concatination by (+)
        String s3 = "Biswanath";
        String s4 = " ";
        String s5 = ("Chandra");
        String result = s3 + s4 + s5;
        System.out.println(result);


        //Splitting String

        //You can split a string into an array

String fruits = "apple,bnnana,cherry";// based on the delimeter
        String [] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE";// based on the "-"
        String [] split_fruits1 = fruits2.split("-");
        System.out.println(split_fruits1[0]);
        System.out.println(split_fruits1[1]);
        System.out.println(split_fruits1[2]);

        //Using charAt to out the charecter position from a word
        String S7 = "Biswanath";
        System.out.println(S7.charAt(0));
        //System.out.println(S7.charAt(10));// StringIndexoutofBoxException will be given


        //Trim besicaly used to remove the spaces

        String S9 = "Biswanath      ";
        System.out.println(S9.trim());


        //indexof (It's besically used to find the possion of the latter  )

        String S10 = "Biswanath";
        System.out.println(S10.indexOf("a")); // When two same latter is present into the word and the user want to define the 2nd one then how can user do ?
        System.out.println(S10.indexOf("B"));

//contains -->
        String S17 = "Biswanath";
        System.out.println(S17.contains("Biw"));
        System.out.println(S17.contains("Bis"));

//LastIndexOf-

String S89 = "Biswanath";
        System.out.println(S89.lastIndexOf("a"));
//Replace
        String S24 = "Biswanath";
        System.out.println(S89.replace("s","a"));
        System.out.println(S89.replace("h","m"));


        //StratsWith
        String ABK = "Biswanath is a good boy";
        System.out.println(ABK.startsWith("Biswanath"));

        //EndsWith
        String BSK = "Biswanath is a good boy";
        System.out.println(BSK.endsWith("boy"));
//Replace
        String Original = "Banana";
        String Result = Original.replace("n","C");
        System.out.println(Result);
//Replace all
        String Original1 ="My self Biswanath@1234";
        String Result1 = Original1.replaceAll("\\d+"," ");
        System.out.println(Result1);



    }

}
