public class first_1000_primenum {
    public static void prime(int num1,int num2){
        if(num1==1){
            System.out.println(num1+" is not prime");
            num1++;
        }
            for(int i=num1;i<=num2;i++){
                int flag=0;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                }if(flag==0){
                    System.out.println(i+" is prime");
                }else{
                    System.out.println(i+" is not prime");
                }
            }
        }
    public static void main(String[] args){
        prime(1,1000);
    }
}
