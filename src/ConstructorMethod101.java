public class ConstructorMethod101 {
    //Constructor Method
    public ConstructorMethod101(){
        System.out.println("This is the constructor method");
    }
    //Constructor method with parameters
    public ConstructorMethod101(String param){
        System.out.println("This is the constructor method with parameter " + param);
    }
    //Instance method
    public void InstanceMethod(){
        System.out.println("This is an instance method");
    }
}

class ConstructorMethodExample{
    public static void main (String args[]){
        //Create object method1 with default constructor
        ConstructorMethod101 method1 = new ConstructorMethod101();
        method1.InstanceMethod();

        //Create object method2 with constructor with parameters
        ConstructorMethod101 method2 = new ConstructorMethod101("constructor");
        method2.InstanceMethod();
    }
}
