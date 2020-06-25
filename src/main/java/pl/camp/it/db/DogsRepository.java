package pl.camp.it.db;

import com.github.javafaker.Faker;
import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DogsRepository {
    private final List<Dog> dogs = new ArrayList<>();
    private static DogsRepository dogsRepository = null;

    private DogsRepository() {
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public static DogsRepository getDogsRepository() {
        if (dogsRepository == null){
            dogsRepository = new DogsRepository();
        }
        return dogsRepository;
    }

    public void fillDogsRepositoryRandomly() {
        for (int i=0; i<10; i++) {
            this.dogs.add(new Dog(
                    new Faker().name().firstName(),
                    new Random().nextInt(20)));
        }
    }
}
