import java.util.*;

public class user_input {
    public static void main(String[] atgs){
        String name;
        int birth;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur age :");
        boolean hasNextInt=sc.hasNextInt();
        if(hasNextInt) {
            birth = sc.nextInt();
            sc.nextLine();                                        // handle next line character (Enter key)
            if (birth > 0) {
                System.out.println("enter ur name :");
                name = sc.nextLine();

                System.out.println("my name is " + name + " and i am " + birth + " yrs old!");
            } else {
                System.out.println("Invalid age");
            }
        }else{
            System.out.println("birth must be in number not in string");
        }
        sc.close();
    }
}
