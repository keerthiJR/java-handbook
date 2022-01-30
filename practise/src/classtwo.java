class A{
    public void msg(int a,int b){System.out.println(a+b);}
}
public class classtwo extends A{

    public static void main(String[] args) {
        classtwo obj = new classtwo();
        obj.msg(10,10);

    }

}