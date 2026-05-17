package EX_09092025_Operator_casting;

public class Lab008_typecasting2 {
    public static void main(String[] args) {
        long ph_number =8159067755l;
        //short s = ph_number; //Implicit - JVM
        short s1 = (short)ph_number; //Explicit -- User -- Loos the DATA
    }
}
