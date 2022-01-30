import java.util.Arrays;
import java.util.Scanner;

public class reverse_array_challenge {
    public static Scanner sc=new Scanner(System.in);
    public static int[] getIntegers(int[] arr){
        System.out.println("enter the elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void reverse(int[] arr){
        for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
        }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        System.out.println("enter the count");
        int n=sc.nextInt();
        int[] arr=new int[n];
        getIntegers(arr);
        System.out.println("unreversed array ");
        //print(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("reversed array ");
        reverse(arr);
        //print(arr);
        System.out.println(Arrays.toString(arr));
    }
}
