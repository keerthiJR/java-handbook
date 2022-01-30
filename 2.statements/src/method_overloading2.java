public class method_overloading2 {
    public static String getDurationString(int minutes, int seconds){
        if((minutes<0) || (seconds<0) || (seconds>59)){
            return "Invalid value";
        }
        int hours=minutes/60;
        int remaining=minutes%60;

        String hourstring = hours+"h ";
        if(hours<10){
            hourstring="0"+hourstring;
        }

        String minString = remaining+"m ";
        if(remaining<10){
            minString="0"+minString;
        }

        String secondsstring=seconds+"s ";
        if(seconds<10){
            secondsstring="0"+secondsstring;
        }

        return hourstring+minString+secondsstring;
    }

    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid value";
        }
        int minutes=seconds/60;
        int remaining=seconds%60;
        return getDurationString(minutes,remaining);
    }
    public static void main(String[] args){
        System.out.println(getDurationString(14522));
    }
}
