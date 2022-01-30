public class Dog_challenge2 extends Animal_challenge2{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog_challenge2(String name, int brain, int body, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, brain, body, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() is called");
        chew();                         // this.crew()  is also fine
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() is called");
        move(5);
    }

    public void run(){
        System.out.println("dog.run() is called");
        move(10);
    }

    public void movelegs(int speed){
        System.out.println("dog.movelegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move is called");
        movelegs(10);
        super.move(speed);
    }
}
