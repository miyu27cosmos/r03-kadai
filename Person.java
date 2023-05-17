public class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public Person() {
        name = "anonymous";
        age = 20;
    }

    public void speak() {
        System.out.printf("My name is %s. ", name);
        System.out.printf("I am %d years old.\n", age);
    }
}
