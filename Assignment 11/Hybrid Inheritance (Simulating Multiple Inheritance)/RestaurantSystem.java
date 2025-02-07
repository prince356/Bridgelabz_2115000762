class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing delicious meals. Specialty: " + specialty);
    }
}

class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public int getTablesAssigned() {
        return tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers at " + tablesAssigned + " tables.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        System.out.println("Role: Chef");
        System.out.println("Name: " + chef.getName());
        System.out.println("ID: " + chef.getId());
        System.out.println("Specialty: " + chef.getSpecialty());
        chef.performDuties();

        Waiter waiter = new Waiter("John", 202, 5);
        System.out.println("\nRole: Waiter");
        System.out.println("Name: " + waiter.getName());
        System.out.println("ID: " + waiter.getId());
        System.out.println("Tables Assigned: " + waiter.getTablesAssigned());
        waiter.performDuties();
    }
}
