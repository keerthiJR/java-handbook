class vipcustomer{
    private String name;
    private long credit_limit;
    private String email;
    vipcustomer(){
        this("default_name",100000,"default_mail");
    }
    vipcustomer(String name,long credit_limit){
        this(name,credit_limit,"vasan@gmail.com");
    }
    vipcustomer(String name,long credit_limit,String email){
        this.name=name;
        this.credit_limit=credit_limit;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public long getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}


public class Vip_challenge {
    public static void main(String[] args){
        vipcustomer v1=new vipcustomer();
        System.out.println(v1.getName());
        System.out.println(v1.getEmail());
        System.out.println(v1.getCredit_limit());

        vipcustomer v2=new vipcustomer("keerthi",10000);
        System.out.println(v2.getName());
        System.out.println(v2.getEmail());
        System.out.println(v2.getCredit_limit());

        vipcustomer v3=new vipcustomer("keerthi",10000,"keerthi@gmail.com");
        System.out.println(v3.getName());
        System.out.println(v3.getEmail());
        System.out.println(v3.getCredit_limit());
    }
}
