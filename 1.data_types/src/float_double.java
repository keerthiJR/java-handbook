public class float_double {
    public static void main(String[] args){
        //    double value >>> float value
        float minvalue = Float.MIN_VALUE;
        float maxvalue = Float.MAX_VALUE;
        double minvalue1 = Double.MIN_VALUE;
        double maxvalue1 = Double.MAX_VALUE;

        System.out.println(minvalue);
        System.out.println(maxvalue);
        System.out.println(minvalue1);
        System.out.println(maxvalue1);

        int a=10/2;
        float b=5f/3f;                // float b=(float)10.25;
        double c=5.00/3.00;                // by default its double    // double c=5/3; double c=5d/3d;
        System.out.println("int value "+a);
        System.out.println("float value "+b);
        System.out.println("double value "+c);

        double x=5d;
        double y=x * 0.45359237d;
        System.out.println(y);

        double pi = 3.1415927d;
        double anothernumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anothernumber);
    }
}
