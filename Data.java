public class Data {
    private int num;
    private String str;

    public Data(int n, String s) {
        num = n;
        str = s;
    }

    public void show() {
        System.out.printf("num: %d, str: %s\n", num, str);
    }

    public void add(Data d) {
        num = num + d.num;
        str = str + d.str;
    }

    public int equals(Data d) {
        int result = 0;
        if (this.num == d.num && this.str == d.str) {
            result = 3;
        } else if (this.num == d.num && this.str != d.str) {
            result = 2;
        } else if (this.num != d.num && this.str == d.str) {
            result = 1;
        } else if (this.num != d.num && this.str != d.str) {
            result = 0;
        }
        return result;

    }
}
