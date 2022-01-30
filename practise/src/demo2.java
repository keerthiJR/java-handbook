import java.util.Scanner;
import java.util.Vector;

public class demo2 {
    public static Vector <Integer> value(int[] arr,int size){
        Vector<Integer> pair=new Vector<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=1;i<size;i++){
            if(max<(arr[i]+arr[i-1])){
                max=arr[i]+arr[i-1];
                if(pair.isEmpty()){
                    pair.add(arr[i-1]);
                    pair.add(arr[i]);
                }else{
                    pair.set(0,arr[i-1]);
                    pair.set(1,arr[i]);
                }
            }
        }return pair;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Vector<Integer> arrlist=new Vector<Integer>();
        arrlist= value(arr,n);
        int sum=0;
        for(Integer sh:arrlist){
            sum=sum+sh;
        }
        System.out.println(sum);
    }
}
