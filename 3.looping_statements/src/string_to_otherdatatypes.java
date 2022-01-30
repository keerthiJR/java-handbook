public class string_to_otherdatatypes {
    public static void main(String[] args){
        String number="true";

        int number1=Integer.parseInt(number);
        double number2=Double.parseDouble(number);
        long number3=Long.parseLong(number);
        float number4=Float.parseFloat(number);                  // Integer,Double....  is a wrapper class
        short number5=Short.parseShort(number);
        byte number6=Byte.parseByte(number);
        boolean number9=Boolean.parseBoolean(number);

        System.out.println(number+1);
        System.out.println(number1+1);
        System.out.println(number2+1.23);
        System.out.println(number3+1212121212);
        System.out.println(number4+1.344);
        System.out.println(number5+1);
        System.out.println(number6+1);
        System.out.println(number9);
    }
}
