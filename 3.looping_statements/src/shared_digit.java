public class shared_digit {
    public static boolean template(int num1,int num2){
        boolean demo=false;
        while(num2>0){
            int rem=num2%10;
            if(num1==rem){
                demo=true;
                break;
            }num2/=10;
        }return demo;
    }
    public static void shareddigit(int num1,int num2){
        int temp=0;
        while(num1>0){
            int rem=num1%10;
            if(template(rem,num2)){
                System.out.println("there is a same integer");
                temp=1;
                break;
            }num1/=10;
        }if(temp==0){
            System.out.println("there is no same integer");
        }

    }
    public static void main(String[] args){
        shareddigit(12345,889789);
    }
}
