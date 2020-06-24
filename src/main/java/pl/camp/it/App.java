package pl.camp.it;

import com.github.javafaker.Faker;
import pl.camp.it.db.DogsRepository;
import pl.camp.it.db.Persistence;
import pl.camp.it.model.Dog;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        fillDogsRepoRandomly();
        Persistence.saveData();
    }

    private static void fillDogsRepoRandomly() {
        for (int i=0; i<10; i++) {
            DogsRepository.getDogsRepository().getDogs().add(new Dog(
                    new Faker().name().name(),
                    new Random().nextInt(20)));
        }
    }
}
