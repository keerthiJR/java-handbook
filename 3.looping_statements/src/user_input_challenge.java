import java.util.Scanner;

public class user_input_challenge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i =1,sum=0,counter=0;
        while(counter<=10){                                        // while(true)
            System.out.println("enter the number #"+i);
            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt){
                sum+=sc.nextInt();
                i+=1;
                counter+=1;
//                if(counter==5){
//                    break;
//                }
            }else{
                System.out.println("invalid number");
                sc.nextLine();
            }
        }
        System.out.println("sum of the numbers :"+sum);
    }
}

