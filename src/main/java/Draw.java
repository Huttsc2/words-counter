public class Draw {
    int areaX;
    int areaY;
    int dotX;
    int dotY;
    int pointX;
    int pointY;
    public Draw(int areaX, int areaY, int dotX, int dotY, int pointX, int pointY) {
        this.areaX = areaX;
        this.areaY = areaY;
        this.dotX = dotX;
        this.dotY = dotY;
        this.pointX = pointX;
        this.pointY = pointY;
    }
    public void draw(int x, int y) {
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                if (i == 0 && j == areaY - 1) {
                    System.out.print("_");
                    System.out.println();
                } else if (i == 0 || i == areaX - 1) {
                    System.out.print("_");
                } else if (j == 0) {
                    System.out.print("|");
                } else if (j == areaY - 1) {
                    System.out.print("|");
                    System.out.println();
                } else if (i == x && j == y) {
                    System.out.print("*");
                } else if (i == pointX && j == pointY) {
                    System.out.print("O");
                } else if (i > 1 || i < areaX-2 || j >1 || j < areaY-2) {
                    System.out.print(" ");
                }
            }
        }
    }
    public void draw() {
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                if (i == 0 && j == areaY - 1) {
                    System.out.print("_");
                    System.out.println();
                } else if (i == 0 || i == areaX - 1) {
                    System.out.print("_");
                } else if (j == 0) {
                    System.out.print("|");
                } else if (j == areaY - 1) {
                    System.out.print("|");
                    System.out.println();
                } else if (i == pointX && j == pointY) {
                    System.out.print("O");
                } else if (i > 1 || i < areaX-2 || j >1 || j < areaY-2) {
                    System.out.print(" ");
                }
            }
        }
    }
}