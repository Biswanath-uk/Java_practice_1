package EX_17_05_2026_Array;

public class Lab127_Array_PostDefine {
    public static void main(String[] args) {
        //With int data type
        int [] marks2 = new int[5];
        System.out.println(marks2.length); // Lenth of the array
        marks2 [0] = 11;
        marks2 [1] = 15;
        marks2 [2] = 19;
        marks2 [3] = 10;
        marks2 [4] = 10;
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);
        System.out.println(marks2[3]);
        System.out.println(marks2[4]);

int sum = marks2[0]+marks2[1]+marks2[2]+marks2[3]+marks2[4];
        float Average = sum/5;
        if (Average>=10){
            System.out.println("Student is pass");
        }
        else {
            System.out.println("Bal ta fail koreche");
        }


//With String datatype
        String Best [] = {"Biswanath ,Apurba "};



        String Best2 [] = new String [3];
        Best2 [0] = "Biswanath";
        Best2 [1] = "Apurba";
        Best2 [2] = "Gandu";
        System.out.println(Best2.length);
        System.out.println(Best2[0]);
        System.out.println(Best2[1]);
        System.out.println(Best2[2]);

        //With boolean data type
        boolean[] is_mail_data = new boolean[2];
        is_mail_data[0] = true;
        is_mail_data[1] = false;
        System.out.println(is_mail_data[0]);
        System.out.println(is_mail_data[1]);
    }
}
