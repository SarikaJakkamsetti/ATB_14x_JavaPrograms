package Tasks_assigned_Liveclass;
 import java.util.*;
public class Inverted_Right_angle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = scanner.nextInt();

        for(int i = n; i>=1; i-- ){
            for(int j =1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");


        }

    }
}
