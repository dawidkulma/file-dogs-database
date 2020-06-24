package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Persistence {
    private static final String dbFileName = "dogs_file_db.txt";

    public static void saveData() {
        try{
            FileWriter fileWriter = new FileWriter(dbFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean newLineFlag = false;
            for (Dog dog : DogsRepository.getDogsRepository().getDogs()) {
                if (newLineFlag) {
                    bufferedWriter.newLine();
                }
                newLineFlag = true;
                bufferedWriter.append(new StringBuilder()
                        .append("Dog;")
                        .append(dog.getName())
                        .append(";")
                        .append(dog.getAge())
                        .toString());
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
