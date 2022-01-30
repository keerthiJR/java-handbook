public class indexOf {
    public static void main(String[] args){
        String s1="this is index of example";

        int index1=s1.indexOf("is");
        System.out.println(index1);

        int index2=s1.indexOf("is",3);
        System.out.println(index2);

        int index3=s1.indexOf('i');
        System.out.println(index3);

        int index4=s1.indexOf('i',3);
        System.out.println(index4);
    }
}
