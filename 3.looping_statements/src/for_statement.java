public class for_statement {
    public static void calculateInterest(double amount, double interest){
        System.out.println(amount+" at "+interest+" % = "+String.format("%.2f",amount*(interest/100)));    // strign format -- after decimal points
    }
    public  static void main(String[] args){
        for(int i=1;i<10;i++){
            calculateInterest(10000,i);
        }
    }
}
