public class isEmpty {
    public static void main(String[] args) {
        String name="";
        String anothername="keerthi jr";
        if(name.length()==0 || name.isEmpty()){
            System.out.println("name is empty");
            System.out.println(anothername);
        }else if(anothername.length()==0 || anothername.isEmpty()){
            System.out.println(name);
            System.out.println("another name is empty");
        }
    }
}
