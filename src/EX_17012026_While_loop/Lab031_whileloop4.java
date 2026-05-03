package EX_17012026_While_loop;

public class Lab031_whileloop4 {
    public static void main(String[] args) {
        //Take the user input for the age and print the out put
        //30,29,28....1
        String age1 = args[0];
        int age = Integer.parseInt(age1);
        while (age > 0) {
            System.out.println(age);
            age--;
        }
    }
}

