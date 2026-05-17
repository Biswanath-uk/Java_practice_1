package EX_17_05_2026_Array;

public class Lab_126_DefineArray {
    public static void main(String[] args) {
        int [] marks = {51,100,91,87,90,91,92};
        //This is how we can create the array with the pre define element
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        System.out.println(marks[10]);//ArrayIndexOfBoundsException
        System.out.println(marks.length);//  To find out the lenth of the array

    }
}
