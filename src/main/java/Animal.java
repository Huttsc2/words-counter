public class Animal {

    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;


    private boolean isSwim;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public void display() {
        System.out.println("Type " + type);
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Weight " + weight);
        System.out.println("Fly " + isFly);
        System.out.println("Walk " + isWalk);
        System.out.println("Swim " + isSwim);
        System.out.println();
    }

    public void rename(String rename) {
        setName(rename);
    }

    public void holiday() {
        setWeight(this.weight + 0.1);
    }
    public void holiday(double m) {
        setWeight(this.weight+=m);
    }
    public void holiday(double m, int n) {
        setWeight(this.weight + m * n);
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
    }
    public Animal() {

    }

}
class Bird extends Animal {
    String area;
    boolean winterFly;

    @Override
    public void display() {
        System.out.println("I`m bird");
        System.out.println(getArea());
        System.out.println(isWinterFly());
        super.display();
    }

    public Bird() {
        setFly(true);
    }
    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public void chirickChirick() {
        System.out.println("Chirick-Chirick");
        System.out.println();
    }
}
class Fish extends Animal {
    String squama;
    boolean upStreamSwim;


    @Override
    public void display() {
        System.out.println("I`m fish");
        System.out.println(getSquama());
        System.out.println(isUpStreamSwim());
        super.display();
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
        setSwim(true);
    }

    public void bulBul() {
        System.out.println("Bul-Bul");
        System.out.println();
    }
}
class Insect extends Animal {

    int wingCount;
    boolean likeJesus;
    @Override
    public void display() {
        System.out.println("I`m insect");
        System.out.println(getWingCount());
        System.out.println(isLikeJesus());
        super.display();
    }
    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public Insect() {
        setWalk(true);
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }
}