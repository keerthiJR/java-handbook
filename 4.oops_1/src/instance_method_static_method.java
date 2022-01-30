// static method - we don't need to create object for calling the method     just - // classname.methodname()

/*  -> Static methods are declared using a static modifier.
    -> Static methods can't access instance methods and instance variables directly.
    -> They are usually used for operations that don't require any data from an instance of the class (from 'this').
    -> In static methods we can't use the this keyword.
    -> Whenever you see a method that does not use instance variables that method should be declared as a static method.
    -> For example main is a static method and it is called by the JVM when it starts an application.
*/

class calculator{
    public static void print(int a,int b){
        System.out.println(a+b);
    }
}
public class instance_method_static_method {
    public static void printhello(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        calculator.print(5,10);
        printhello();
    }
}

// Instance method - we need to create object for calling the method

/*  -> Instance methods belong to an instance of a class.
    -> To use an instance method we have to instantiate the class first usually by using the new keyword.
    -> Instance methods can access instance methods and instance variables directly.
    -> Instance methods can also access static methods and static variables directly.
*/
//class calculator{
//    public void print(int a,int b){
//        System.out.println(a+b);
//    }
//}
//public class instance_method_static_method {
//    public void printhello(){
//        System.out.println("hello");
//    }
//    public static void main(String[] args){
//        calculator c1=new calculator();
//        c1.print(4,5);
//        instance_method_static_method p1=new instance_method_static_method();
//        p1.printhello();
//    }
//}
