package EX_17_05_2026_Array;

public class Lab132_ArrayForEach1 {
    public static void main(String[] args) {
        int [] a = new int [3];
        a[0] = 90;
        a[1] = 91;
        a[2]= 92;
//        for (int i = 0 ; i<a.length; i++){
//            System.out.println(a[i]);
//       /
        for(int i:a ){
            System.out.println(i);
        }
        String []Name = new String [3];
        Name [0]= "Biswanath";
        Name [1]= "Surjo";
        Name [2] = "Trisha";
        for (String i :Name){
            System.out.println(i);
        }
    }
}
