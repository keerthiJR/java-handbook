public class prime1 {
    public static int prime(int num){
        if(num==1){
            return -1;
        }else{
            for(int i=2;i<Math.sqrt(num);i++){                     // for(int i=2;i<=num/2;i++)  -- for space complexity
                if(num%i==0){                                   // for(int i=2;i<=Math.sqrt(num);i++)   -- for more space complexity than above
                    return -1;
                }
            }return 1;
        }
    }
    public static void prime(int num,int num1) {
        if(num==1){
            System.out.println("the number " + num + " is not prime");
            num++;
        }
            for (int i = num; i <= num1; i++) {
                int flag = 0;
                for (int j = 2; j < i; j++) {                               // for (int j = 2; j <= Math.sqrt(i); j++)
                    if (i % j == 0) {
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    System.out.println("the number " + i + " is not prime");
                } else {
                    System.out.println("the number " + i + " is prime");
                }
            }
        }

    public static void main(String args[]){
        for(int i=1;i<=30;i++){
            int a=prime(i);
            if(a==1){
                System.out.println(i+" is prime");
            }else{
                System.out.println(i+" is not prime");
            }
        }

        prime(1,20);
    }
}
