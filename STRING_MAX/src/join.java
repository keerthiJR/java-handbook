import java.util.Scanner;

public class join {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter today day");
        int day=sc.nextInt();
        System.out.println("enter today month");
        int month=sc.nextInt();
        System.out.println("enter this year");
        int year=sc.nextInt();
        String value1 = null; // String value1="";
        String name=value1.join("/",String.valueOf(day),String.valueOf(month),String.valueOf(year));
        System.out.println(name);
    }
}
