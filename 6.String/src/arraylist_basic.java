import java.util.ArrayList;
import java.util.Scanner;

class arraylist_basic1 {

    private static ArrayList<String> arrayList=new ArrayList<String>();
    public ArrayList<String> printapplication(){
        return arrayList;
    }
    public static void additem(String item){
        arrayList.add(item);
    }
    public static void removeitem(String item){
        int product=position(item);
        if(product>=0) {
            removeitem(product);
            System.out.println("item removed!!!");
        }else{
            System.out.println("no item found !!!");
        }
    }
    private static void removeitem(int item){
        arrayList.remove(item);
    }
    public static void modifyitem(String olditem,String newitem){
        int position=position(olditem);
        if(position>=0){
            modifyitem(position,newitem);
        }else{
            System.out.println("no item found !!!");
        }
    }
    private static void modifyitem(int position,String newitem){
        arrayList.set(position,newitem);
    }
    public static String searchitem(String item){
        int position=arrayList.indexOf(item);
        if(position>=0){
            return arrayList.get(position);
        }else{
            return null;
        }
    }
    public static void printitem(){
        if(arrayList.isEmpty()){
            System.out.println("no items is added !!!");
        }else {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(i+1+". "+arrayList.get(i));
            }
        }
    }
    private static int position(String item){
        return arrayList.indexOf(item);
    }
}



public class arraylist_basic{
        private static Scanner sc = new Scanner(System.in);
        private static arraylist_basic1 t1 = new arraylist_basic1();

        public static void main(String[] args) {
            boolean quit = false;
            position();
            while (!quit) {
                System.out.print("enter ur choice : ");
                boolean hasint = sc.hasNextInt();
                if (hasint) {
                    int n = sc.nextInt();
                    sc.nextLine();
                    if(n<=6) {
                        switch (n) {
                            case 0:
                                position();
                                break;
                            case 1:
                                t1.printitem();
                                break;
                            case 2:
                                additem();
                                break;
                            case 3:
                                modifyitem();
                                break;
                            case 4:
                                removeitem();
                                break;
                            case 5:
                                searchitem();
                                break;
                            case 6:
                                print();
                                break;
                            case 7:
                                quit = true;
                                System.out.println("application exited !!");
                                break;
                        }
                    }else{
                        System.out.println("enter valid value");
                        position();
                    }
                }else {
                    System.out.println("enter valid value");
                    sc.next();
                }
            }
        }

        public static void position() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of grocery items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To print the application.");
            System.out.println("\t 7 - To quit the application.");
        }
        public static void additem(){
            System.out.print("enter the item to add : ");
            t1.additem(sc.nextLine());
            System.out.println("item added !!!");
        }
        public static void removeitem(){
            System.out.print("enter the item to remove : ");
            t1.removeitem(sc.nextLine());
        }
        public static void modifyitem(){
            System.out.print("enter the old item : ");
            String n=sc.nextLine();
            System.out.print("enter the new item to replace:");
            String name=sc.nextLine();
            t1.modifyitem(n,name);
        }
        public static void searchitem(){
            System.out.print("enter the item to search : ");
            String name=t1.searchitem(sc.nextLine());
            if(name==null){
                System.out.println("item not found !!!");
            }else{
                System.out.println("item :"+name+" is found !!!");
            }
        }
        public static void print(){
            ArrayList<String> newarraylist = new ArrayList<String>();
            newarraylist.addAll(t1.printapplication());

            ArrayList<String> newarraylist2=new ArrayList<String>(t1.printapplication());

            String[] newarray = new String[t1.printapplication().size()];
            newarray = t1.printapplication().toArray(newarray);

            print2(newarraylist);
            print2(newarraylist2);
            print2(newarray);
        }
        public static void print2(ArrayList<String> array){
            System.out.print("items : ");
            for(int i=0;i<array.size();i++){
                System.out.print(array.get(i)+" ");
            }System.out.println();
        }
        public static void print2(String[] array){
            System.out.print("items : ");
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }
}
