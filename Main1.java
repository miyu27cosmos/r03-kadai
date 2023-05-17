//第10週 Main1
public class Main1 {
    public static void main(String[] args) {
        Car car1, car2;
        car1 = new Car(1234, 25.5);
        car2 = new Car(6789, 40);
        car1.show();
        car2.show();
        car1.moveGas(car2);  //car2からcar1へ移動する
        car1.show();
        car2.show();
        car2.setCar(15.5);
        car2.moveGas(car1);  //car1からcar2へ移動する
        car1.show();
        car2.show();
    }
}
