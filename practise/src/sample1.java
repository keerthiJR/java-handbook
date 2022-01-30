import java.util.Scanner;

class Primemanagement{
    int primeID;
    String userprofilename;
    String subcrptiontype;
    Double subcrptionprice;
    int noofprofiles;
    Primemanagement(int primeID, String userprofilename, String subcrptiontype, Double subcrptionprice, int noofprofiles){
        primeID=this.primeID;
        userprofilename=this.userprofilename;
        subcrptiontype=this.subcrptiontype;
        subcrptionprice=this.subcrptionprice;
        noofprofiles=this.noofprofiles;
    }

    public int getPrimeID() {
        return primeID;
    }

    public void setPrimeID(int primeID) {
        this.primeID = primeID;
    }

    public String getUserprofilename() {
        return userprofilename;
    }

    public void setUserprofilename(String userprofilename) {
        this.userprofilename = userprofilename;
    }

    public String getSubcrptiontype() {
        return subcrptiontype;
    }

    public void setSubcrptiontype(String subcrptiontype) {
        this.subcrptiontype = subcrptiontype;
    }

    public Double getSubcrptionprice() {
        return subcrptionprice;
    }

    public void setSubcrptionprice(Double subcrptionprice) {
        this.subcrptionprice = subcrptionprice;
    }

    public int getNoofprofiles() {
        return noofprofiles;
    }

    public void setNoofprofiles(int noofprofiles) {
        this.noofprofiles = noofprofiles;
    }
}
public class sample1 {
    public static int findaveragebytype(Primemanagement[] obj1,String s){
        int total=0,count=0;
        for(Primemanagement p:obj1){
            if(p.getSubcrptiontype().equalsIgnoreCase(s) && p.getNoofprofiles()>3) {
                total += 1;
                count += p.getSubcrptionprice();
            }
        }
        if(count==0){
            return 0;
        }
        return count/total;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Primemanagement[] pbj=new Primemanagement[4];
        for(int i=0;i<pbj.length;i++){
            int primeID=Integer.parseInt(sc.nextLine());
            String userprofilename=sc.nextLine();
            String subcrptiontype=sc.nextLine();
            Double subcrptionprice=Double.parseDouble(sc.nextLine());

            int noofprofiles=Integer.parseInt(sc.nextLine());

           pbj[i]=new Primemanagement(primeID,userprofilename,subcrptiontype,subcrptionprice,noofprofiles);
            pbj[i].setPrimeID(primeID);
            pbj[i].setUserprofilename(userprofilename);
            pbj[i].setSubcrptiontype(subcrptiontype);
            pbj[i].setSubcrptionprice((double) subcrptionprice);
            pbj[i].setNoofprofiles(noofprofiles);
        }
        String s = sc.nextLine();
        int result=findaveragebytype(pbj,s);
        if(result==0){
            System.out.println("There are no such prime Management");
        }else{
        System.out.println(result);}
    }

}
