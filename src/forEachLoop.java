public class forEachLoop {
    public static void main(String[] args){
        String[] celebrities = {"Bruno Mars", "Taylor Swift", "Max Smith", "Eminem"};
        //for each loop
        //Loop on the celebrities array
        for (String name:celebrities
             ) {
            System.out.print(name);
            System.out.print(", ");
        }

        System.out.print("\n");
        //Integer Array
        int[] age = {20, 22, 24, 43};
        for(int x: age){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
