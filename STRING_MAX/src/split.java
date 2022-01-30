public class split {
    public static void main(String[] args) {
        String name="i am keerthi vasan i luv football";
        String[] words=name.split("\\s");
        for(String x:words){
            System.out.println(x);
        }

        String name1="i am keerthi vasan i luv football";
        String[] words1=name1.split("\\s",0);
        for(String x:words1){
            System.out.println(x);
        }

        String name2="i am keerthi vasan i luv football";
        String[] words2=name2.split("\\s",1);
        for(String x:words2){
            System.out.println(x);
        }

        String name3="i am keerthi vasan i luv football";
        String[] words3=name3.split("\\s",2);
        for(String x:words3){
            System.out.println(x);
        }

        String name4="i am keerthi vasan i luv football";
        String[] words4=name4.replace("vasan","JR").split("JR",2);
        for(String x:words4){
            System.out.println(x);
        }
    }
}
