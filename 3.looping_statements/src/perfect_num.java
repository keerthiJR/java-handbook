public class perfect_num {
    public static void perfectnum(int num){
        int sum=0,temp=num;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }if(temp==sum){
            System.out.println("perfect number : "+temp+" = "+sum);
        }else{
            System.out.println("not perfect number : "+temp+" != "+sum);
        }
    }
    public static void main(String[] args){
        perfectnum(496);
    }
}
