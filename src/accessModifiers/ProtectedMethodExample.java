package accessModifiers;

import com.ep.practice.AccessModiferTestPackage.Person;

public class ProtectedMethodExample extends Person {
    public static void main(String args[]){
        ProtectedMethodExample person1 = new ProtectedMethodExample();
        person1.greet("Sam");
    }
}
