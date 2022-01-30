import java.util.Scanner;

public class user_input_challenge2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=0,min=0;                                       // int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        boolean flag=true;
        while(true) {
            System.out.println("enter the number");
            boolean hasInt = sc.hasNextInt();
            if(hasInt){
                int sample=sc.nextInt();
                if(flag){
                    flag=false;
                    max=sample;
                    min=sample;
                }
                if(sample>max){
                    max=sample;
                }if(sample<min){
                    min=sample;
                }
            }else{
                break;
            }sc.nextLine();
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}
