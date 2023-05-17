//第10週 Main2
public class Main2 {
    public static void main(String[] args) {
        Data d1, d2;
        //インスタンスを生成する
        d1 = new Data(4, "foo");
        d2 = new Data(10, "bar");
        //情報を出力してみる
        d1.show();
        d2.show();
        //add を実行して出力してみる
        d1.add(d2);
        d1.show();
    }
}
