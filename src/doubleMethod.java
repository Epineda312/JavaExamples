public class doubleMethod {
    public static void main(String args[]){
        System.out.println(add(21,22));
        System.out.println(add(22.01, 25.42));
        System.out.println(add(434343,21313));
        System.out.println(add(-1313,11313));
    }
    //Method that returns string value
    public static Double add(double num1, double num2){
        return num1 + num2;
    }
}
