package pl.camp.it.db;

import com.github.javafaker.Faker;
import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogsRepository {
    private final List<Dog> dogs = new ArrayList<>();
    private static DogsRepository dogsRepository = null;

    private DogsRepository() {
        Faker faker = new Faker();
        for (int i=0; i<10; i++) {
            this.dogs.add(new Dog(
                    faker.dog().name(),
                    faker.dog().age()));
        }
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public static DogsRepository getDogsRepository() {
        if (dogsRepository == null) {
            dogsRepository = new DogsRepository();
        }
        return dogsRepository;
    }
}