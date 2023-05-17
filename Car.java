//ここに自分の名前
class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
    }

    public void show() {
        System.out.println("(num)" + num + " (gas)" + gas);
    }

    public void setCar(int n) {
        num = n;
    }

    public void setCar(double g) {
        gas = g;
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
    }

    public int compareGas(Car c) {
        int result = 0;
        if (this.gas > c.gas)
            result = 1;
        if (this.gas < c.gas)
            result = -1;
        if (this.gas == c.gas)
            result = 0;
        return result;
    }

    public void moveGas(Car c) {
        this.gas += c.gas;
        c.gas = 0;
    }
}

class Sample110 {
    public static void main(String[] args) {
        Car car1, car2, tmp;
        car1 = new Car(1234, 25.5);
        car2 = new Car(6789, 40);
        car1.show();
        car2.show();

        tmp = car2;
        car2 = car1;
        car1 = tmp;
        car1.show();
        car2.show();
    }
}
/*
 * car1.setCar(4567, 10.5);
 * car1.show();
 * car2.show();
 * 
 * car2 = null; // ここでcar2の参照を切る
 * car2.show(); // 参照先がないメソッドを呼び出して例外が発生する
 * 
 * car2 = new Car(6789, 40);
 * System.out.println("compareGasの結果: " + car1.compareGas(car2));
 * System.out.println("compareGasの結果: " + car2.compareGas(car1));
 * car1.setCar(40.0);
 * System.out.println("compareGasの結果: " + car1.compareGas(car2));
 * }
 */
