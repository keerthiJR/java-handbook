public class prime2 {
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }

            return true;
        }
    }
    public static void main(String[] main){
        int temp=0;
        for(int i=2;i<=20;i++){
            if(isPrime(i)){
                temp++;
                System.out.println(i+" is a prime number");
                if(temp==3){
                    System.out.println("exiting the for loop after 3 prime numbers");
                    break;
                }
            }
        }
    }
}

