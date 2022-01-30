import java.util.Scanner;
public class average {
    public static int[] getIntegers(int n){
        int[] arr=new int[n];
        System.out.println("enter "+n+" numbers :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void getPrint(int[] arr){
        System.out.println("the numbers are :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static double getAverage(int[] arr){
        int avg;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }avg=sum/arr.length;
        System.out.println("the average is :");
        return (double)avg;
    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int[] arr=getIntegers(n);
        getPrint(arr);
        System.out.println(getAverage(arr));
    }
}
