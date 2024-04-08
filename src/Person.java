public class Person {
    public String name;
    int age;
    private String gender;

    public void info() {
        System.out.println("My name ist " + name + " und mein age " + age);
    }

    public void info(int salery) {
        System.out.println("My name ist " + name + " und mein age " + age + salery);
    }

    public void info(int weight, int salery) {
        System.out.println("My name ist " + name + " und mein age " + age + weight);
        System.out.println(2);
    }
}
