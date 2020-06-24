package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;

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
}
