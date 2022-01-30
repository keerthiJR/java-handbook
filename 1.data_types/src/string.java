public class string {
    public static void main(String args[]){
        String mystring = "keerthi vasan";
        System.out.println("my name is "+mystring);
        mystring = mystring + " and i luv to play football";      // strings in java are immutable
        System.out.println("my name is "+mystring);
        mystring = "my name is "+ mystring + " \u00A9 2021";
        System.out.println(mystring);                          // string is not a data type in java its a class

        String numberstring = "250";
        System.out.println(numberstring+"250");

        int a=10;
        System.out.println(numberstring+a);

        double b=10.96;
        System.out.println(numberstring+b);

    }
}

//   Strings are immutable
//   StringBuffer are mutable
