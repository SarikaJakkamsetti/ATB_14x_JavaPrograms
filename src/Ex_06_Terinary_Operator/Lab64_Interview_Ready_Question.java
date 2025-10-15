package Ex_06_Terinary_Operator;

public class Lab64_Interview_Ready_Question  {
    public static void main(String[] args){
        int age = 43;
        // Nested ternary
        // result = condition1? expression 1: (Condition2 ? expression2:expression3);
        String result = (age > 18)? (age >25? "you can drink":"You can go Goa but can't drink"): "You can't go Goa";
        System.out.println(result);
    }
}
