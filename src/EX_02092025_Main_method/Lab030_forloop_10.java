package EX_02092025_Main_method;

public class Lab030_forloop_10 {
    public static void main(String[] args) {
        for (int i = 0; i<50; i++){
            if (i%2 ==0){
                System.out.println("Even Number" + i);
                continue;
            }
            System.out.println("ODD");
        }
    }
}
