public class sum_of_digit {
    public static int sumDigits(int number){
        int rem=0,ren=0;
        if(number>=10) {
            while (number > 0) {
                rem = number % 10;
                ren+=rem;
                number /= 10;
            }return ren;
        }return -1;
    }
    public static void main(String[] args){
        System.out.println(sumDigits(55125));
    }
}
