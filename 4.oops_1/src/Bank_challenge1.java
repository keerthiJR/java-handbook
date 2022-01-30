public class Bank_challenge1 {
   private long account_number;
   private double balance;
   private String customer_name;
   private String email;
   private long phone_number;

   public Bank_challenge1(){
       this(12345678,30000,"vasan","vasan@gmail.com",9876543);
       System.out.println("constructor method called");
   }
   public Bank_challenge1(long account_number,double balance,String customer_name, String email, long phone_number){
       System.out.println("paramaterised constructor called");
       this.account_number=account_number;
       this.balance=balance;
       this.customer_name=customer_name;
       this.email= email;
       this.phone_number=phone_number;
   }

   public void setaccnum(long account_number){
       this.account_number=account_number;                   // code -> generate
   }                                                   // shortcut for getters and setters
   public long getaccnum(){
       return account_number;
   }

//    public void setBalance(double balance){
//        this.balance=balance;
//    }
    public double getBalance(){
        return balance;
    }

    public void setcusname(String customer_name){
        this.customer_name=customer_name;
    }
    public String getcusname(){
        return customer_name;
    }

    public void setmail(String email){
        this.email=email;
    }
    public String getmail(){
        return email;
    }

    public void setphnum(long phone_number){
        this.phone_number=phone_number;
    }
    public long getphnum(){
        return phone_number;
    }

    public void setdeposit(long amount){
       this.balance+=amount;
    }

    public void setwithdraw(long amount){
       if(balance>amount) {
           this.balance -= amount;
       }else{
           System.out.println("Low Balance");
           System.out.println("current balance : "+this.balance);
       }
    }

}
