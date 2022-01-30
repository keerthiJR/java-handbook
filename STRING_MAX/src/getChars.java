public class getChars {
    public static void main(String[] args){
        // public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
        String name="i am keerthi vasan i luv football";

        char[] arr=new char[20];
        name.getChars(5,18,arr,0);
        System.out.println(arr);

        char[] arr2=new char[name.length()];
        name.getChars(0,name.length(),arr2,0);
        System.out.println(name);

    }
}
