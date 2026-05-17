package EX_02092026_Funtion;

public class Lab_115_FuntionWithArgwithOutReturn {
    public static void main(String[] args) {
//2. Without parameters/arguments with return type
        int voting_age = age_of_vote();
if (voting_age >= 18){
    System.out.println("Alow to vote ");
}
else {
    System.out.println("Not able to vote ");

}
//1. With out arguments/parameters and without return type
for (int i =0 ; i<=10; i++){
    greet();}
    }
    static int age_of_vote ()
    {
        System.out.println("When can i vote ");
        return 17;
    }

    static void greet ()
    {
        System.out.println("My name is biswa ");
    }
}
