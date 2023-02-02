public class Bob {
    public static void main(String[] args) {
        Person bob = new Person("Bob", 15);
        bob.display();
        bob.setAge(16);
        bob.setName("Bobby");
        bob.display();
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
    }
}
