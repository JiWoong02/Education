package test;



public class main {
    public static void main(String[] args) {
        Person obj = new Person("Kim");
        obj.print();
    }
}
class Person {
    private String name;
    public Person(String val) {
        name = val;
    }
    public static String get() {
    return name;
    }
    public void print() {
        System.out.println(name);
    }
}