package EX_17_05_2026_Array;

import java.util.Arrays;

public class Lab129_ArrayFindMaxAndMinNumber {
    public static void main(String[] args) {
int [] Surjo = {9,89,38,84,83,84,2};
int max_value =Max_value(Surjo);
        System.out.println(max_value);

        int min_value = Min_value(Surjo);
        System.out.printf("Minimum value is %d", min_value);


        Arrays.sort(Surjo);
        System.out.println(Surjo[Surjo.length-1]);


    }
    static int Max_value(int []Surjo){
        int max =Surjo[0];
        for(int i = 0 ;i<Surjo.length; i++) {
            if (Surjo[i]>max){
                max =Surjo[i];
            }
        }


        return max;
    }


    static int Min_value(int []Surjo){
        int min =Surjo[0];
        for(int i = 0 ;i<Surjo.length; i++) {
            if (Surjo[i]<min){
                min =Surjo[i];
            }
        }


        return min;
    }
}
