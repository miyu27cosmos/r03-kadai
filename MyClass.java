//ここに自分の名前
class MyClass {
    public static void main(String[] args) {
        int a, b;
        String str1, str2;

        a = 1;
        b = 2;

        str1 = "Hello, ";
        str2 = "World!";
        System.out.printf("%d\n", a + b);
        System.out.printf("%s\n", str1 + str2);
        System.out.println(str1 + str2);
        System.out.println(a + str1 + b + str2);

        int[] test;
        test = new int[5];
        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;
        for (int i = 0; i < test.length; i++) {
            System.out.println(i + ": " + test[i]);
        }
        int sum = 0;
        for (int i = 0; i < test.length; i++) {
            sum += test[i];
        }
        System.out.println(sum);

    }
}
