import java.util.Scanner;
public class sorted_array_challenge1 {
    public static Scanner sc=new Scanner(System.in);
    public static int[] getIntegers(int n){
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }return arr;
    }
    public static void printArray(int[] arr){
        System.out.println("elements are :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortArray(int[] arr){
        //int arr1[]= Arrays.copyOf(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }return arr;
    }
    public static void main(String[] args){
        System.out.println("enter the number");
        int n=sc.nextInt();
        int[] arr=getIntegers(n);
        printArray(arr);
        sortArray(arr);
        printArray(arr);
    }
}
