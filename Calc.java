public class Calc {
    private int x, y;

    public void setX(int i) {
        x = i;
    }

    public int getX() {
        return x;
    }

    public void setY(int i) {
        y = i;
    }

    public int getY() {
        return y;
    }

    public void show() {
        System.out.println("x:" + x + "  y:" + y);
    }

    public Calc() {
        x = 5;
        y = 7;
    }

    public Calc(int num1, int num2) {
        x = num1;
        y = num2;
    }

    public void setX() {
        x = 0;
    }

    public void setX(int a, int b) {
        x = a + b;
    }
}
