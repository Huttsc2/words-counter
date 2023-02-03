public class Dot {
    int startX;
    int startY;
    public Dot(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }
    public int getStartX() {
        return startX;
    }
    public int getStartY() {
        return startY;
    }
    public void move(String x) {
        switch (x) {
            case "w":
                startX--;
                break;
            case "s":
                startX++;
                break;
            case "a":
                startY--;
                break;
            case "d":
                startY++;
                break;
        }
    }
}