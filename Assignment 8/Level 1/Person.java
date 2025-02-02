public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("John", 25);
        Person clonedPerson = new Person(originalPerson);

        System.out.println("Original Person: " + originalPerson.name + ", " + originalPerson.age);
        System.out.println("Cloned Person: " + clonedPerson.name + ", " + clonedPerson.age);
    }
}
