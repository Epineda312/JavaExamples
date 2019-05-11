public class Constant {
    public static String name;
    public static final double PI = 3.14; //Constants
}

class ConstantMethod {
    public static void main(String args[]){
        Constant.name = "Kevin";
        System.out.println(Constant.name);
        System.out.println(Constant.PI);
    }
}
