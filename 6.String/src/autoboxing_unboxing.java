import java.util.ArrayList;
class intclass{
    private int myvalue;

    public intclass(int myvalue) {
        this.myvalue = myvalue;
    }

    public int getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(int myvalue) {
        this.myvalue = myvalue;
    }
}
public class autoboxing_unboxing {
    public static void main(String[] args){
        String[] stringarray = new String[10];
        int[] intarray = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<String>();

        ArrayList<intclass> intclassarray = new ArrayList<intclass>();
        ArrayList<Integer> intarraylist = new ArrayList<Integer>();

        intclassarray.add(new intclass(19));
        //----------------------AutoBoxing
        for(int i=0;i<10;i++){
            intarraylist.add(Integer.valueOf(i));
        }
        //----------------------UnBoxing
        for(int i=0;i<10;i++){
            System.out.println(intarraylist.get(i).intValue());
        }

        Integer value = 50;  // autoboxing - Integer.valueOf(50)
        int value1=value;  // unboxing - value.intValue();

        ArrayList<Double> myDoublevalue = new ArrayList<Double>();

        for(double i=0.0;i<=10.0;i=i+0.5){
            myDoublevalue.add(Double.valueOf(i));
        }
        for(int i=0;i<myDoublevalue.size();i++){
            System.out.println(i+" = "+myDoublevalue.get(i).doubleValue());
        }

    }
}
