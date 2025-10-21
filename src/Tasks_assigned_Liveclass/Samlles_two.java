package Tasks_assigned_Liveclass;
import java.util.*;
public class Samlles_two {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one");
        int n1 = scanner.nextInt();
        System.out.println("Enter number two");
        int n2 = scanner.nextInt();
        if(n1>n2){
            System.out.println("Smallest number is" + n2);
        }
        else{
            System.out.println("Smallest number is"+ n1);
        }
    }
}
