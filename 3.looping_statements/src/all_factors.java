public class all_factors {
    public static void allfactors(int num){
        System.out.println("the factors are :");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        allfactors(125);
    }
}
