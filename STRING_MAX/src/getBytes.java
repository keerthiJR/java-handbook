

public class getBytes {
    public static void main(String[] args){
        String name="abcdefghijklmnopqrstuvwxyz";
        byte[] arr=name.getBytes();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        String name2=new String(arr);
        System.out.println(name2);

        int a=93;
        System.out.println(String.valueOf(a));
    }
}
