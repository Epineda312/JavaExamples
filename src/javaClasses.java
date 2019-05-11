public class javaClasses {
    public static void main(String args[]){
        name_of_dog("Max");//Call name_of_dog
        bark(); //Call bark Method
        eat(); //Call eat method
        sleep(); //Call sleep method
        play(); // Call play method

        //2nd dog
        name_of_dog("Jackie");
        bark();
        eat();
        sleep();
        play();
    }

    //Methods
    public static void name_of_dog(String name){
        System.out.println(String.format("Name is: %s", name));
    }

    public static void bark(){
        System.out.println("I am barking");
    }

    public static void sleep(){
        System.out.println("I am sleeping");
    }

    public static void eat(){
        System.out.println("I am eating");
    }

    public static void play(){
        System.out.println("I am playing.");
    }
}
