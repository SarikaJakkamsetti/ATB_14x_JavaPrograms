package Ex_05_Type_Casting;

public class Lab61_TypeCasting_Used {
    public static void main(String[] args){
        int course = 100;
        float GST = 18.5f;

        // int total = course + GST; //Narrowing implicit
        int total = course+ (int) GST; // Narrowing explicit
        System.out.println(total);

        float total1 = course+ GST;
        System.out.println(total1);

    }
}
