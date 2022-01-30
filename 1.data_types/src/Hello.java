public class Hello {
    public static void main(String args[]){
        System.out.println("hello world");
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println("max value "+max);
        System.out.println("min value "+min);
        System.out.println("busted max value "+(max+1));
        System.out.println("busted min value "+(min-1));

         // int b=2147483648;   -- the error is telling us the integer value is too large

        int b=2_147_483_647;               // this is acceptable in >java7
        System.out.println(b);

        byte c=Byte.MIN_VALUE;
        byte d=Byte.MAX_VALUE;
        System.out.println("min value "+c);
        System.out.println("max value "+d);

        Short e=Short.MIN_VALUE;
        Short f=Short.MAX_VALUE;
        System.out.println("min value "+e);
        System.out.println("max value "+f);
        
        long mylongvalue=100L;
        Long g=Long.MIN_VALUE;
        Long h=Long.MAX_VALUE;
        System.out.println("min value "+g);
        System.out.println("max value "+h);

        long r=92_23_37_20_36_85_47_75_807L;
        System.out.println(r);
    }
}

/*  int
    short
    long
    byte    -128 to +127                   -- primitive data types
    float
    double
    char
    boolean
 */
