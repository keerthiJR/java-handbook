public class prime {
    public static void main(String[] args) {
        int num = 1;
        if(num==1){
            System.out.println("not prime");
        }else{
        int flag = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        }
    }
}
