public class casting {
    public static void main(String args[]){
        int a=Integer.MAX_VALUE;
        byte c=Byte.MAX_VALUE;
        short e=Short.MAX_VALUE;
       // byte d=(c/2);      -- error - because c/2 is consider has integer value

        int b=(a/2);         // -- by default its int
        byte d=(byte)(c/2);
        short f=(short)(e/2);

        System.out.println(b);
        System.out.println(d);
        System.out.println(f);


        int intvalue = 10;
        byte bytevalue = 20;
        short  shortvalue = 30;
        long longvalue = 1000 + 10 * (intvalue + bytevalue + shortvalue );    // long accepts bcause int length < long length
        short shortvalue1 =(short)( 1000 + 10 * (intvalue + bytevalue + shortvalue ));  // casting
        System.out.println(longvalue);
        System.out.println(shortvalue1);
    }
}
