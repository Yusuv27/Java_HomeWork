package First.Funcional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteAnimals {

    public WriteAnimals(){
        try {
            System.out.println("Введите ID животного: ");
            Scanner scanner = new Scanner(System.in);
            Integer input = Integer.parseInt(scanner.nextLine());
            while (true) {
                System.out.println("Показать: \n1.Все\n2.Только команды\nВведите число: ");
                Scanner scanner1 = new Scanner(System.in);
                String input1 = scanner1.nextLine();
                if (input1.equals("1")) {
                    database_3(input);
                    break;
                } else if (input1.equals("2")) {
                    database_3_1(input);
                    break;
                } else
                    System.out.println("Некорректно введен ответ.");
            }
        }catch (Exception e){
            System.out.println("ID Введено некорректно!");
        }
    }

    public void database_3(Integer id_search) {
        String fileName = "myfile.txt";
        String separator = "~";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String lastLine = null;
            String info = "Такой Id не найден\n";

            while ((line = br.readLine()) != null) {
                lastLine = line;
                String[] elements = line.split("~");
                ArrayList elementList = new ArrayList();
                for(String element : elements){
                    elementList.add(element);
                }
                if (id_search.equals(Integer.parseInt(elementList.get(0).toString()))){

                    System.out.println("Id | Type | Animals_type | Name | BirthOfDay | Commands:\n"+line.toString().replace("~"," | "));
                    info="";
                    break;
                }
            }
            System.out.println(info);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
    public void database_3_1(Integer id_search) {
        String fileName = "myfile.txt";
        String separator = "~";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String lastLine = null;
            String info = "Такой Id не найден";

            while ((line = br.readLine()) != null) {
                lastLine = line;
                String[] elements = line.split("~");
                ArrayList elementList = new ArrayList();
                for(String element : elements){
                    elementList.add(element);
                }
                if (id_search.equals(Integer.parseInt(elementList.get(0).toString()))){
                    line=elementList.get(5).toString();
                    info="Id найдено!";
                    System.out.println(info);
                    System.out.println(line.toString());
                    break;
                }
            }
            if (info.equals("Такой Id не найден")){
                System.out.println(info);
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
