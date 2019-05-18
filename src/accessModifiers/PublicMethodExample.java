package accessModifiers;
import com.ep.practice.AccessModiferTestPackage.Customer;
public class PublicMethodExample {
    public static void main(String args[]){
        Customer customer1 = new Customer();
        customer1.greet("Bobby");
    }
}
