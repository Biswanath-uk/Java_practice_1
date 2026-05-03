package EX_09092025;

public class Lab009_typecasting_originam_Example {
    public static void main(String[] args) {
        //GST -18.45
        int course = 100;
                float GST = 18.45f;
                int total_PF = course + (int)GST; //Narrowing -->Explicit
                System.out.println(total_PF);
    }
}
