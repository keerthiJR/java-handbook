public class format {
    public static void main(String[] args){
        System.out.println(String.format("%s","keerthi"));
        System.out.println(String.format("%f",32.45));
        System.out.println(String.format("%.12f",32.23));
        System.out.println(String.format("%32.2f",32.213245678));
        System.out.println(String.format("%d",101));
        System.out.println(String.format("%x",101));
        System.out.println(String.format("%c",'c'));
        System.out.println(String.format("%d",101));
        System.out.println(String.format("|%10d|",101));
        System.out.println(String.format("|%-10d|",101));
        System.out.println(String.format("| %d|",101));
        System.out.println(String.format("|%010d|",101));
    }
}
