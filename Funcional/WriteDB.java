package First.Funcional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteDB {
    String fileName = "myfile.txt";
    public WriteDB(){
        readFile();
    }
    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.replace("~"," | "));
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
