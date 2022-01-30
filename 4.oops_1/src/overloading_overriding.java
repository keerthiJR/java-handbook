/*
Method overloading :
- > Methods will be consider overloaded if both follow the following rules
   - > Methods must have the same methods name.
   - > Methods must have different parameters.
- > if methods follow the rules above then they may or may not
   - > have different return types.
   - > have different access modifiers
   - > throw different checked or unchecked exceptions

Method Overriding :
- > Method overriding means defining a method in a child class that already exists in the parent class with same signature(same name,same arguments)
- > By extending the parent class the child class gets all the methods defined in the parent class(those methods are also known as derived methods)
- > method overriding is also known as runtime polymorphism and dynamic method dispatch, because the method that is going to be called is decided at
    runtime by the jvm.
- > when the override a method it's recommended to put @override immediately above the method definition. this is an annotation that the compiler reads
    and will then show us an error if we don't follow overriding rules correctly.
- > we can't override static methods only instance methods.


- > Method will be considered overridden if we follow these rules
    - >  It must have same name and same arguments.
    - > Return type can be a subclass of the return type in the parent class.
    - > It can't have a lower access modifier.
    - > For example if the parent method is protected then using private in the child is not allowed but using public in the child would be allowed.

- > There are also some important points about method overriding to keep in mind
    -> Only inherited methods can be overridden, in other words methods can be overridden only in child classes.
    -> Constructors and private methods cannot be overridden.
    -> Methods that are final cannot be overridden.
    -> A subclass can use super.methodName() to call the superclass version of an overridden method.

diff btw method overloading and method overriding :

              METHOD OVERLOADING                                                                METHOD OVERRIDING

1.Provides functionality to reuse a method name with different parameters  -  1.Used to override a behavior which the class has inherited from the parent class.
2.Usually in a single class but may also be used in a child class.  - 2.Always in two classes that have a child-parent or IS-A relationship.
3.Must have different parameters.                                   - 3.Must have the same parameters and same name.
4.May have different return types.                                  - 4.Must have the same return type or covariant return type (child class).
5.May have different access modifiers(private, protected, public).  - 5.Must NOT have a lower modifier but may have a higher modifier.
6.May throw different exceptions.                                   - 6.Must NOT throw a new or broader checked exception.
 */