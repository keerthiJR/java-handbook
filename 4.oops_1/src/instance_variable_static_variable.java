/* static variable
    -> Declared by using the keyword static.
    -> Static variables are also known as static member variables.
    -> Every instance of that class shares the same static variable.
    -> If changes are made to that variable, all other instances will see the effect of the change.
    -> Static variables are not used very often but can sometimes be very useful.
    -> For example when reading user input using Scanner we will declare scanner as a static variable.
    -> That way static methods can access it directly.
*/
class Dog{
    private static String name;
    public Dog(String name){
        Dog.name=name;                   // this.name=name;   also correct
    }
    public void printname(){
        System.out.println("name : "+name);
    }
}
public class instance_variable_static_variable {
    public static void main(String[] args){
        Dog rex=new Dog("rex");
        Dog fluffy=new Dog("fluffy");
        rex.printname();
        fluffy.printname();
    }
}
/* Instance variable
    -> They don't use the static keyword.
    -> Instance variables are also known as fields or member variables.
    -> Instance variables belong to an instance of a class.
    -> Every instance has it's own copy of an instance variable.
    -> Every instance can have a different value (state).
    -> Instance variables represent the state of an instance.
 */
//class Dog{
//    private String name;
//    public Dog(String name){
//        this.name=name;                        // Dog.name cannot be used because name is not a static variable
//    }
//    public void printname(){
//        System.out.println("name : "+name);
//    }
//}
//public class instance_variable_static_variable {
//    public static void main(String[] args){
//        Dog rex=new Dog("rex");
//        Dog fluffy=new Dog("fluffy");
//        rex.printname();
//        fluffy.printname();
//    }
//}

