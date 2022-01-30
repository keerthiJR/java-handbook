public class challenge {
    public static void main(String args[]){
        double a=20.00d;
        double b=80.00d;
        double result=a+b*100.00d;
        System.out.println(result);
        double d=result%40.00d;
        System.out.println(d);
        boolean demo = d==0.0 ? true : false;
        System.out.println(demo);
        if(!demo){
            System.out.println("Got some reminder");
        }
    }
}
