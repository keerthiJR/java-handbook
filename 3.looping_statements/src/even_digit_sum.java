public class even_digit_sum {
    public static void evendigitsum(int num){
        int rem=0,ren=0,sum=0;
        if(num>10){
        while(num>0){
            rem=num%10;
            if(rem%2==0){
                sum+=rem;
            }
            num/=10;
        }System.out.println("sum of even digit : "+sum);
        }else{
            System.out.println("number should be >10");
        }

    }
    public static void main(String[] args){
        evendigitsum(123452);
    }
}
