public class Animal_challenge2 {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal_challenge2(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("animal.eat()  is called ");
    }

    public void move(int speed){
        System.out.println("animal.mov() is called");
        System.out.println("animal is moving at a speed : "+speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
