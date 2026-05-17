package EX_09092025_Operator_casting;

public class task2_ternaryoperator {
    public static void main(String[] args) {
        //Nested Ternary
        //result =condition1 ? expression1 : (Condition2 ? expression2 : expression3)
        //Grade - system -Score --> A
        //Grade - system -Score --> B
        //Grade - system -Score --> C
        //Grade - system -Score --> D
        //Grade - system -Score --> F

        int score = 85;
        String grade = (score>=90)? "A" : (score >=80)? "B" : (score >=70)? "C" : (score >=60)? "D" : "F";

        System.out.println("Your Grade is ->"+ grade);
        System.out.printf("Your grade is %s", grade);
    }
}
