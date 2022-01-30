import java.util.*;

public class sample {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    public static String getDay(String day, String month, String year) {

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d);

        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<n;i++) {
            String w = sc.next();
            list.add(w);
        }
        for(int i=0;i<n;i++) {
            String arr[] = list.get(i).split("-");
            System.out.println(getDay(arr[2],arr[1],arr[0]));
        }

    }
}