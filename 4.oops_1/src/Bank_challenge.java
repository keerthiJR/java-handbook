public class Bank_challenge {
    public static void main(String[] args){
        Bank_challenge1 b1=new Bank_challenge1();
//        Bank_challenge1 b1=new Bank_challenge1(12345678,30000,"vasan","vasan@gmail.com",9876543);
//        b1.setaccnum(1030230311);
//        b1.setcusname("Keerthi vasan");
//        b1.setmail("keerthi@gmail.com");
//        b1.setphnum(638271611);
//        b1.setdeposit(20000);

        System.out.println(b1.getaccnum());
        System.out.println(b1.getcusname());
        System.out.println(b1.getmail());
        System.out.println(b1.getphnum());
        System.out.println(b1.getBalance());
        b1.setdeposit(50000);
        System.out.println(b1.getBalance());
        b1.setwithdraw(30000);
        System.out.println(b1.getBalance());
        b1.setwithdraw(80000);
        System.out.println(b1.getBalance());

    }
}
