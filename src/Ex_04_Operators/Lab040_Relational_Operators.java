package Ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args){
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_Sarika = 33;
        int age_MK = 34;

        boolean result = age_MK >= age_Sarika;
        System.out.println(result);
    }
}
