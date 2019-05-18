package accessModifiers;

public class Person {
    int age = 40;

    //Default method - it does not have private, public or protected access modifiers.
    void greet(String name){
        System.out.println("Hello, " + name);
    }
}
