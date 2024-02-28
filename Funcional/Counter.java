package First.Funcional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counter {
    String fileName = "myfile.txt";
    public Counter(){
        Add();
    }
    public void Add(){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            Boolean result = true;
            String line;
            StringBuilder sb_line = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb_line.append(line);
                String[] list = line.split("~");
                ArrayList arrayList = new ArrayList(Arrays.asList(list));
                if ((arrayList.size()!=6)&&(arrayList.size()!=1)){
                    System.out.println('\n'+"\u001B[31m"+"Работа была не в ресурсе ID!: "+arrayList.get(0)+"\u001B[0m"+'\n');
                    result = false;
                }
                for (Object element : arrayList){
                    if((element.toString().equals(""))&&(element.toString()!="]")&&(arrayList.size()!=1)){
                        System.out.println('\n'+"\u001B[31m"+"Работа была не в ресурсе ID: "+arrayList.get(0)+"\u001B[0m"+'\n');
                        result = false;
                    }
                }
                String[] list_DateOfBirth = line.split("/");
                ArrayList arrayList1 = new ArrayList(Arrays.asList(list_DateOfBirth));
                for (Object element1: arrayList1){
                    if (element1.toString().equals("")&&(arrayList.size()!=1)){
                        System.out.println('\n'+"\u001B[31m"+"Работа была не в ресурсе (Дата рождения некорректно заполнено!) ID: "+arrayList.get(0)+"\u001B[0m"+'\n');
                        result = false;
                    }
                }
            }
                if (result){
                    System.out.println('\n'+"\u001B[32m"+"Все ID работают в ресурсе!"+"\u001B[0m"+'\n');
                }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
