public class prime_factor {
    public static int factor(int num) {
        int max = Integer.MIN_VALUE;
        while (num > 0) {
            if (num % 2 == 0) {
                max = 2;
                boolean flag = true;
                while (flag) {
                    num = num % 2;
                    if (num % 2 == 1) {
                        flag=false;
                    }else if(num==0){
                        flag=false;
                    }
                }
            } else if (num % 3 == 0) {
                max = 3;
                boolean flag = true;
                while (flag) {
                    num = num % 3;
                    if (num % 3 == 1) {
                        flag = false;
                    }else if(num==0){
                        flag=false;
                    }
                }
            } else if (num % 5 == 0) {
                max = 5;
                boolean flag = true;
                while (flag) {
                    num = num % 5;
                    if (num % 5 == 1) {
                        flag = false;
                    }else if(num==0){
                        flag=false;
                    }
                }
            } else if (num % 7 == 0) {
                max = 7;
                boolean flag = true;
                while (flag) {
                    num = num % 7;
                    if (num % 7 == 1) {
                        flag = false;
                    }else if(num==0){
                        flag=false;
                    }
                }
            }
        }
            return max;

    }

    public static void main(String[] args){
            System.out.println("highest prime factor is: "+factor(49));
    }
}
