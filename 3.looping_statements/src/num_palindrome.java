public class num_palindrome {
    public static void palindrome(int num){
        if(num>=10){
            int rem=0,ren=0,temp=num;
            while(num>0){
               rem=num%10;
               ren=rem+(ren*10);
               num/=10;
            }if(temp==ren){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }else{
            System.out.println("number should be >10");
        }
    }    public static void main(String[] args){
        palindrome(121);
    }
}
