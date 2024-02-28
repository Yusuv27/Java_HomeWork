package First.Database;

import java.io.*;
import java.util.ArrayList;
public class database_2 {
    public database_2(ArrayList arrayList){
        String fileName = "myfile.txt"; // Имя файла, в который будем писать


        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            Integer number_id=0;
            number_id=database_3(number_id);
            number_id+=1;
            bw.write(number_id.toString());
            for (int i = 0; i < arrayList.size();i++) {

                String content = arrayList.get(i).toString();
                bw.write(content);
            }
            bw.close();

            System.out.println("Запись в файл успешно завершена.");

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
    public static Integer database_3(Integer number_id) {
        String fileName = "myfile.txt";
        String separator = "~";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String lastLine = null;

            while ((line = br.readLine()) != null) {
                lastLine = line;
            }

            if (lastLine != null) {
                String[] elements = lastLine.split("~");
                ArrayList elementList = new ArrayList();
                for(String element : elements){
                    elementList.add(element);
                }
                if (elementList.get(0).equals("")){
                    return number_id=0;
                }
                number_id=Integer.parseInt(elementList.get(0).toString());
                System.out.println(number_id);
                return number_id;
            } else {
                System.out.println("Файл содержит менее двух строк.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return number_id;
    }
}

