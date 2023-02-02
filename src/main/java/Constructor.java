public class Constructor {
    public static void main(String[] args) {

        Man.displayCounter();

        Man tom = new Man();
        Man bob = new Man();

        Man.displayCounter();
    }
}
class Man {

    private int id;
    private static int counter = 1;

    Man() {
        id = counter++;
    }

    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}