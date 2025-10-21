package Tasks_assigned_Liveclass;
 import java.util.*;
public class Max_Three_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        System.out.println("Enter third number");
        int n3 = scanner.nextInt();
         int Max_no = (n1>n2)?n1:((n2>n3)?n2:n3);
         System.out.println("Max number is"+ Max_no);


    }
}
