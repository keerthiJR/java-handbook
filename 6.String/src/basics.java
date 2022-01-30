public class basics {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("element "+i+" :"+arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i*10;
        }print(arr);
    }
}
