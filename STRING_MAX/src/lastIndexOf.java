public class lastIndexOf {
    public static void main(String[] args) {
        String s1="this is index of example";
        int index1=s1.lastIndexOf('s');
        System.out.println(index1);

        String str = "This is index of example";
        int index = str.lastIndexOf('s',5);
        System.out.println(index);

        String str1 = "This is last index of example";
        int index11 = str1.lastIndexOf("of");
        System.out.println(index11);

        String str2 = "This is last index of example";
        int index2 = str2.lastIndexOf("of", 25);
        System.out.println(index2);

        index2 = str.lastIndexOf("of", 10);
        System.out.println(index2);
    }
}
