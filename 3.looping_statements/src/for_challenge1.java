public class for_challenge1 {
    public static void main(String[] args){
        int sum=0,temp=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
                temp++;
                System.out.println("the number divisible by both 3 and 5 are "+i);
                if(temp==5){
                    System.out.println("the sum of the above divisible numbers are "+sum);
                    System.out.println("exiting the foor loop");
                    break;
                }
            }
        }
    }
}
