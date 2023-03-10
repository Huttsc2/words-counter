import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area(15, 45);
        Dot dot = new Dot(7, 22);
        Dot point = new Dot(3, 12);
        Draw draw = new Draw(area.getHeight(), area.getWidth(), dot.getStartX(), dot.getStartY(), point.getStartX(), point.getStartY());
        draw.draw();
        System.out.println();
        draw.draw(dot.getStartX(), dot.getStartY());
        while (dot.getStartX() != point.getStartX() || dot.getStartY() != point.getStartY()) {
            dot.move(sc.next());
            draw.draw(dot.getStartX(), dot.getStartY());
        }
    }
}