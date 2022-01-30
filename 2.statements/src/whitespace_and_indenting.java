public class whitespace_and_indenting {
    public static void main(String[] args){
        int              myvar           =
                50
                ;

        myvar++;
        myvar
                --;

        System.out.println("this is a test");
        System.out.println("This "
                +"is "
                +"still "
        +
                "more ");
    }
}
   //      code -> reformat code                 -- this will alter the code in the correct format (indentation)