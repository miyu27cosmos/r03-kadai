//第10週 Main2
public class Main3 {
    public static void main(String[] args) {
        Data d1, d2, d3, d4, d5;
        d1 = new Data(4, "foo");
        d2 = new Data(10, "bar");
        d3 = new Data(7, "foo");
        d4 = new Data(4, "bar");
        d5 = new Data(4, "foo");

        d1.show();
        d2.show();
        d3.show();
        d4.show();

        System.out.println("d1.equals(d2): " + d1.equals(d2));
        System.out.println("d1.equals(d3): " + d1.equals(d3));
        System.out.println("d1.equals(d4): " + d1.equals(d4));
        System.out.println("d1.equals(d5): " + d1.equals(d5));
    }
}
