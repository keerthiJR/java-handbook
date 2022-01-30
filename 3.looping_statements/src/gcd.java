public class gcd {

//    public static int gcd(int a,int b){
//        if(a==0){
//            return b;
//        }else if(b==0){
//            return a;
//        }else if(a>b){
//            return gcd(a-b,b);
//        }else{
//            return gcd(a,b-a);
//        }
//    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }else if(b==0){
            return a;
        }else if(a>b){
            int i=2;
            int temp=i;
            for(i=2;i<=a/2;i++){
                if((a%i==0 && b%i==0)){
                    temp=i;
                }
            }return temp;
        }else{
            int i=2;
            int temp=i;
            for(i=2;i<=b/2;i++){
                if((a%i==0 && b%i==0)){
                    temp=i;
                }
            }return temp;
        }
    }

    public static void main(String[] args){
//        System.out.println(gcd(98,56));
        System.out.println(gcd(56,98));
    }
}
