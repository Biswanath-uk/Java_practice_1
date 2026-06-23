package EX_17_05_2026_Array;

import java.util.Arrays;

public class Lab_126_DefineArray {
    public static void main(String[] args) {
        int [] marks = {51,100,91,87,90,92};
        //This is how we can create the array with the pre define element

        System.out.println(marks.length);
        //  To find out the lenth of the array

        Arrays.sort(marks);// If the user want's to print in shorted manner
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
       // System.out.println(marks[10]);//ArrayIndexOfBoundsException

        System.out.println("--------------------");
for (int i =0; i<marks.length ; i++) {
    System.out.println(marks[i]);
        }

//Use of th the Arrays.binarySearch

        Arrays.sort(marks);
int item_index = Arrays.binarySearch(marks,100);
        System.out.println(item_index);
       // binary search is besically used to search a elimrnt in a shorted array





    }
}
