import java.util.*;

public class demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> temp=new ArrayList<String>();
        String s1 = sc.nextLine();
        int flag = 0;
        String[] splitted = s1.split(" ");
        for (String s : splitted) {
            String str = s.toLowerCase();
            if(str.contains("a") || str.contains("s") ||str.contains("h") ||str.contains("u") ||str.contains("z")) {

                flag = 1;
                temp.add(s);

            }else{
                flag=0;
                break;
            }
            if(flag == 0)
                System.out.println("No magic words");
            else{
                System.out.println(temp);
            }
        }
    }
}