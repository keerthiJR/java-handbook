/*   Lets discuss the difference btw the this and the super keywords.
we'll also find out about the differences between the this() and super() method calls.

  super and this keyword :
        - > the keyword super is used to access or call the parent class members (variables and methods).
        - > the keyword this  is used to call the current class members (variables and methods).
             - > this  keyword is required when we have the parameter with the same name as an instance variable(field).


       . NOTE : We can use both of them anywhere in a class expect static areas(the static block or a static method).
                Any attempt to do so will lead to compile-time errors.


this keyword :
        the keyword this is commonly used constructors and setters, and optionally in getters.
super keyword :
        the keyword super is commonly used with method overriding.when we call a method with the same name from the parent class.


    super and this call :
          - > use this() to call a constructor from another overloaded constructor in the same class.
          - > this() can be used only in a constructor, and it must be the first statement in a constructor.
          - > it's used with constructor chaining, in other words when one constructor calls another  constructor, and helps to reduce duplicate code.
          - > the only way to call the parent constructor by calling super().this calls the parent constructor.

          - > the java compiler puts a default call to super() if we don't add  it, and it is always the no-args super which
              is inserted by compiler (constructor without arguments).
          - > the call to super() must be the first statement in each constructor.
          - > Even abstract classes have constructors,although you can never instantiate an abstract class using new keyword.
          - > An abstract class is still a super class, so its constructors run when someone makes an instance of a concrete subclass.

        . NOTE : A constructor can have a call to super() or this() but never both.
 */

//class Rectange{
//    private int x;
//    private int y;
//    private int width;
//    private int height;
//    public Rectange(){                           // BAD CODE
//        this.x=0;
//        this.y=0;
//        this.width=0;
//        this.height=0;
//
//    }
//    public Rectange(int width,int height){
//        this.x=0;
//        this.y=0;
//        this.width=width;
//        this.height=height;
//    }
//    public Rectange(int x,int y,int width,int height){
//        this.x=x;
//        this.y=y;
//        this.width=width;
//        this.height=height;
//    }
//}


//class Rectange{
//    private int x;
//    private int y;
//    private int width;
//    private int height;
//    public Rectange(){                           // GOOD CODE
//        this(0,0);
//
//    }
//    public Rectange(int width,int height){
//        this(0,0,width,height);
//    }
//    public Rectange(int x,int y,int width,int height){
//        this.x=x;
//        this.y=y;
//        this.width=width;
//        this.height=height;
//    }
//}


//class shape{
//    private int x;
//    private int y;
//    public shape(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//}
//class Rectangle extends shape{
//    private int width;
//    private int height;
//    public Rectangle(int x,int y){
//        this(x,y,0,0);
//    }
//    public Rectangle(int x,int y,int width,int height){
//        super(x,y);
//        this.width=width;
//        this.height=height;
//    }
//}


/// Important NOTE : while extends, constructor must be declared in the base class also known as parent class or super class
  // because in derived class while creating constructor first line must be super() (invisible) so we must create constructor on super class

// there must be atleat one default constructor in super class