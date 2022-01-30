public class first_last_digit_sum {
    public static int power(int num){
        int sum=10;
        while(num>1){
           sum=sum*10;
           num--;
        }
        return sum;
    }
    public static int length(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum++;
            num/=10;
        }
        return sum-1;
    }
    public static void firstlastsum(int num){
        if(num>=10){
           int last_digit=num%10;
           int a=length(num);
           int b=power(a);                       // double b=Math.pow(10,a);
           int first_digit=num/b;
           int result=first_digit+last_digit;
           System.out.println("sum of first and last digits are : "+result);
        }
    }
    public static void main(String[] args){
        firstlastsum(5687);
    }
}
