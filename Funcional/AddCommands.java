package First.Funcional;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddCommands {
    String fileName = "myfile.txt";
    public AddCommands(){
        String textfull=null;
        String line_search = null;
        String new_commands = null;
        textfull=WriteAllLine(textfull);
        line_search=WriteID(line_search);
        String[] list_line = line_search.split("~");
        ArrayList arrayList = new ArrayList();
        for(String element : list_line){
            arrayList.add(element);
        }
        ArrayList commands_list = new ArrayList();
        String redactor = arrayList.get(5).toString();
        commands_list.add(redactor.replace("[","").replace("]",""));
        while (true){
            System.out.println("Введите новую команду/команды(пишите по одному): ");
            Scanner scanner = new Scanner(System.in);
            new_commands=scanner.nextLine();

            commands_list.add(new_commands);
            System.out.println("Хотите еще?(для выхода напишите end), для продолжения отправьте любое значение: ");
            Scanner scanner2=new Scanner(System.in);
            String exit = scanner2.nextLine();

            if (exit.equals("end")){
                StringBuilder stringBuilder = new StringBuilder();
                for(int i = 0; i < arrayList.size()-1; i++){
                    stringBuilder.append(arrayList.get(i).toString());
                    stringBuilder.append("~");
                }
                stringBuilder.append(commands_list.toString());
                String next_line = stringBuilder.toString();
                textfull = textfull.replace(line_search,next_line).replace("]","]\n");
                break;
            }
        }
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textfull);
            bw.close();
            System.out.println("\u001B[32m"+"Изменения сохранены!"+"\u001B[0m");

        } catch (IOException e) {
            System.err.println("\u001B[31m"+"Ошибка при записи в файл: " + e.getMessage()+"\u001B[0m");
        }
    }
    public String WriteID(String line_search){
            try {
                System.out.println("Введите ID животного: ");
                Scanner scanner = new Scanner(System.in);
                Integer input = Integer.parseInt(scanner.nextLine());

                while (true) {
                        line_search=database_3(input,line_search);
                        return line_search;
                }
            }catch (Exception e){
                System.out.println("\u001B[31m"+"ID Введено некорректно!"+"\u001B[0m");
            }
        return line_search;
    }


    public String database_3(Integer id_search, String line_search) {
        String fileName = "myfile.txt";
        String separator = "~";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String lastLine = null;
            String info = "\"\\u001B[31m\" Такой Id не найден \"\\u001B[0m\"";
            while ((line = br.readLine()) != null) {
                lastLine = line;
                String[] elements = line.split("~");
                ArrayList elementList = new ArrayList();
                for(String element : elements){
                    elementList.add(element);
                }
                if (id_search.equals(Integer.parseInt(elementList.get(0).toString()))){
                    line_search=line.toString();
                    info="\"\\u001B[32m\" Id найдено! \"\\u001B[0m\"";
                    return line_search;
                }
            }
            System.out.println(info);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return line_search;
    }
    public String WriteAllLine(String textfull){
            try (
    BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            System.out.println(line.replace("~"," | "));
            sb.append(line);
        }
        textfull=sb.toString();
        return textfull;
    } catch (
    IOException e) {
                System.err.println("Ошибка чтения файла: " + e.getMessage());
            }
        return textfull;
    }
}
