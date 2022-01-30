public class intern {
    public static void main(String[] args){
        String name1="keerthi vasan";
        String name2=name1.intern();
        String name3=new String("keerthi vasan");
        String name4=name3.intern();
        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name1==name4);
        System.out.println(name2==name3);
        System.out.println(name2==name4);
        System.out.println(name3==name4);
    }
}
