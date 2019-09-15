public class Person {
    public String name;
    private int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
