import java.util.Scanner;

public class minimum_element_challenge {
    public static Scanner sc=new Scanner(System.in);
    public static int[] getIntegers(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the number :");
            boolean hasInt=sc.hasNextInt();
            if(hasInt) {
                arr[i] = sc.nextInt();
            }else{
                break;
            }
        }return arr;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int min(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                }
        }return min;
    }
    public static void main(String[] args){
        System.out.println("enter count :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        getIntegers(arr);
        System.out.println("the elements are :");
        print(arr);
        System.out.println("min element :"+min(arr));
    }
}
