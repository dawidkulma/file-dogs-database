package pl.camp.it.model;

public class Dog {
    private String name;
    private String age; // Java Faker generates dog's age as one of {"puppy", "young", "adult", "senior"}

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public String getAge() { return age; }
}