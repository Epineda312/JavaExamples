public class BooleanMethod {
    public static void main(String args[]){
        System.out.println(isEven(22));
        System.out.println(isEven(20));
        System.out.println(isEven(25));
        System.out.println(isEven( 444442));
    }
    //Method that returns string value
    public static Boolean isEven(int number){
        if(number % 2 ==0){
            return true;
        }
        return false;
    }
}
