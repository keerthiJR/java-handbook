public class coding_exe_1 {
                  // speed converter

    public static long toMilesperHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else{
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesperHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void main(String args[]){
        printConversion(75.114);
    }
}
