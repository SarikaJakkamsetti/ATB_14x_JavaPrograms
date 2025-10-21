package Tasks_assigned_Liveclass;
 import java.util.Scanner;


public class RightAngle {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the n value");
    int n = scanner.nextInt();

    for(int i =0; i<n;i++){
        for(int j = 0; j<=i; j++){

            System.out.print("*");
        }
        System.out.println("");
    }

    }
}
