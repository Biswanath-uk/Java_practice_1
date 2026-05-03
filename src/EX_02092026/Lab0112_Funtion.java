package EX_02092026;

public class Lab0112_Funtion {
        public static void main(String[] args) {
// User define
            //1 Without parameters and without return type
            //2 Without parameters but with return type
            //3 With parameters and without return type
            //4 With parameters and with return type
            grid();
            String return_value= grid_with_hellow();
            System.out.println(return_value);

            int Voting_age =age_of_vote();
            System.out.println(Voting_age);
            if (Voting_age >=18){
                System.out.println("Allow to vote1");
            }
            else
            {
                System.out.println("Not allow to vote ");
            }
            Greet_with_your_name("Biswanath");

            int result = Sum_of_tow_numbers(3,4);
            System.out.println(result);
        }
        //1 Without parameters and without return type Declare /Define
        static void grid (){
            System.out.println("Hi");
        }
        //2 Without parameters but with return type (String value )
        static String grid_with_hellow(){
            System.out.println("Hi, i am type 2");
            return "Hi you are assume ";
        }
    //2 Without parameters but with return type (Integer value )
        static int age_of_vote ()
        {
            System.out.println("Vote age Return");
            return 18;
        }
//3 With parameters and without return type

    static void Greet_with_your_name (String name){
        System.out.println("Hi,Your name is " +name );
    }
    //4 With parameters and with return type
    static int Sum_of_tow_numbers(int a1,int b1){
            return a1+b1;
    }
    }


