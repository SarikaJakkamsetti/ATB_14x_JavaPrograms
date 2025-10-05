package Tasks_assigned_Liveclass;

public class RealAge {
    public static void main(String[] args) {
        int age = 59;
        String person = ((age > 18)? ((age > 60)? "Senior Citizen": "Adult") : "Minor") ;
        System.out.println(person);
    }
}
