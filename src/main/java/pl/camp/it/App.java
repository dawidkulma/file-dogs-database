package pl.camp.it;

import pl.camp.it.db.DogsRepository;
import pl.camp.it.db.Persistence;

public class App {
    public static void main(String[] args) {
        DogsRepository.getDogsRepository().fillDogsRepositoryRandomly();
        Persistence.saveData();
    }
}
