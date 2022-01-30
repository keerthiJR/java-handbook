public class replaceAll {
    public static void main(String[] args) {
        String name="i am keerthi vasan i luv to play football";
        System.out.println(name.replaceAll("keerthi vasan","neymar jr"));
        System.out.println(name.replaceAll("[^a-z0-9]",""));
        System.out.println(name.replaceAll("[\\s]",""));

    }
}
