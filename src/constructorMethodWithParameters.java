class vehicle{
    String make;
    String model;
    int year;

    //Constructor with parameters
    public vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Starting
    public void start(){
        System.out.println("Starting");
    }
}

public class constructorMethodWithParameters {
    public static void main(String[] args){
        //Create ford object
        vehicle ford = new vehicle("Ford", "Taurus", 2012);
        ford.start();
    }

}
