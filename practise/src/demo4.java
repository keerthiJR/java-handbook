import java.util.*;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int flag = 0;
        String[] splitted = s1.split(" ");
        for (String s : splitted) {
            String str = s.toLowerCase();
            if(str.contains("a") || str.contains("s") ||str.contains("h") ||str.contains("u") ||str.contains("z")) {
                System.out.println(s);
                flag = 1;
            }
            if(flag == 0)
                System.out.println("No magic words");
        }
    }
}