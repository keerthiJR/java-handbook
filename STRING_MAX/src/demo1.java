import java.util.*;
public class demo1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen=sc.nextLine();
        String[] words=sen.split(" ");
        int len=words.length;
        if(len<2)
            System.out.println("Given string "+sen+" is too short");
        else if(len>5)
            System.out.println("Given string "+sen+" is too long");
        else {
            char[] letter=new char[len];
            for(int i=0;i<len;i++) {
                int l=words[i].length();
                letter[i]=words[i].charAt(l-1);
            }
            for(char ch: letter)
                System.out.print(Character.toUpperCase(ch));
            System.out.println(" for "+sen.toUpperCase());
        }
    }
}