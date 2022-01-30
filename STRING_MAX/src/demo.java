import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int stud=sc.nextInt();
        if(stud<=0) {
            System.out.println("Invalid input");
        }
        else {
            String[] str= new String[stud];
            String[] r=new String[stud+1];
            for(int i=0;i<stud;i++) {
                str[i]=sc.next();
                String[] s=str[i].split(":");
                r[i]=s[0]+":";
                int l=s.length;
                int sum=0;
                for(int j=1;j<l;j++) {
                    int sum1=Integer.parseInt(s[j]);
                    sum+=sum1;
                }

                if(sum>=400 && sum<=500) {
                    r[i]+="O";
                }
                else if(sum>=300 && sum<=399) {
                    r[i]+="A";
                }
                else if(sum>=250 && sum<=299) {
                    r[i]+="B";
                }
                else if(sum>=200 && sum<=249) {
                    r[i]+="C";
                }
                else if(sum>=0 && sum<=199) {
                    r[i]+="E";
                }


            }
            for(int i=0;i<stud;i++) {
                System.out.println(r[i]);
            }

        }

    }
}