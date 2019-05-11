class Customer {
    //Constructor Method
    public Customer(){
        System.out.println("Welcome to Walmart!");
    }
    //Instance to get customer name
    public void getName(String name){
        System.out.println("Customer name is: " + name);
    }
}


public class ConstructorMethod{
    public static void main(String[] args){
        Customer customer1 = new Customer();//Create object from customer class
        customer1.getName("Danny");//Get name for customer1

        Customer customer2 = new Customer();//Create object from customer class
        customer2.getName("Deena");//Get name for customer2
    }
}