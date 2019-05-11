public class ANDConditional {
    public static void main(String args[]){
        double grade = 4.0;

        if(grade == 4.0){
            System.out.println("You are an awesome student!");
        }else if(grade >= 3.5 && grade < 4.0){
            System.out.println("You are a grade a student!");
        }else if(grade >= 3.0 && grade < 3.5) {
            System.out.println("You are an average student");
        }else if(grade >= 1.5 && grade < 3.0){
            System.out.println("You need to do better.");
        }else {
            System.out.println("You failed the class");
        }
    }
}
