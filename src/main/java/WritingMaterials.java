public class WritingMaterials {

    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    public void display() {
        System.out.println("Name " + getName());
        System.out.println("Color " + getColor());
        System.out.println("Price " + getPrice());
        System.out.println("Length " + getLength());
        System.out.println("Draw " + isDraw());
        System.out.println();
    }


    public void replaceRod(String newColor) {
        this.color = newColor;
    }

    public void priceUp(int up) {
        this.price+=up;
    }

    public void priceDown(int down) {
        this.price-=down;
    }

    public void draw() {
        if (isDraw())
            System.out.println(getName() + " drew a line. It`s color is " + getColor());
        else
            System.out.println(getName() + " can't draw anything");
        System.out.println();
    }

    public void draw(int n) {
        if(isDraw()) {
            System.out.println(getName() + " drew " + n + " lines. Their color is " + getColor());
        } else {
            System.out.println(getName() + " can't draw anything");
        }
        System.out.println();
    }

    public void draw(String color) {
        if(isDraw()) {
            System.out.println(getName() + " drew 1 line. It`s color is " + color);
        } else {
            System.out.println(getName() + " can't draw anything");
        }
        System.out.println();
    }

    public void draw(String color, int n) {
        if(isDraw()) {
            System.out.println(getName() + " drew " + n + " lines. Their color is " + getColor());
        } else {
            System.out.println(getName() + " can't draw anything");
        }
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public boolean isDraw() {
        return draw;
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.name = "No Name";
        this.color = "No Color";
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length =length;
        this.draw = draw;
    }
    public WritingMaterials() {
    }
}

class Pen extends WritingMaterials {

    int countColor;
    boolean auto;

    @Override
    public void display() {
        System.out.println("This is Pen");
        System.out.println(getCountColor());
        System.out.println(isAuto());
        super.display();
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public Pen() {
        setDraw(true);
    }

    public void writeMyName() {
        System.out.println("Mike");
    }
}

class Ruler extends WritingMaterials {

    double length;
    boolean wood;

    @Override
    public void display() {
        System.out.println("This is Ruler");
        System.out.println(getLength());
        System.out.println(isWood());
        super.display();
    }

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public Ruler() {
        setDraw(false);
    }

    public void measure() {
        System.out.println("now measure the length");
    }
}

class Divider extends WritingMaterials {

    String dividerType;
    boolean metal;

    @Override
    public void display() {
        System.out.println("This is Divider");
        System.out.println(getDividerType());
        System.out.println(isMetal());
        super.display();
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public Divider() {
        setDraw(true);
    }

    public void drawCircle() {
        System.out.println("Drew the circle");
    }
}
