package EX_09092025;

public class Lab007_typecasting {
    public static void main(String[] args) {
        //Type Casting -
        //Widening -Implicit ,Explicit - lossless
        //Narrowing - Implicit ,Explicit(with data type), loss
        byte b =10;
        //int a = b; // valid --> Implicit Casting - JVM
        int a1 =(int)b; //Valid -->Explicit  Casting --JVM
        System.out.println(a1);
    }
}
