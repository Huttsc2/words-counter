import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area(10, 20);
        Dot dot = new Dot(5, 10);
        Dot point = new Dot(3, 12);
        Draw draw = new Draw(area.getHeight(), area.getWidth(), dot.getStartX(), dot.getStartY(), point.getStartX(), point.getStartY());
        draw.draw(dot.getStartX(), dot.getStartY());
        while (dot.getStartX() != point.getStartX() || dot.getStartY() != point.getStartY()) {
            dot.move(sc.next());
            draw.draw(dot.getStartX(), dot.getStartY());
        }
    }
}