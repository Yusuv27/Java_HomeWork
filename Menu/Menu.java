package First.Menu;
import First.Funcional.*;
import First.data.*;
import First.Database.database;
import First.Database.database_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public Menu() {
        while (true){
            System.out.println("1.Добавить животное\n2.Просмотреть весь список\n3.Просмотреть по ID Животное\n4.Добавить команду/команды животному\n5.Вывести счетчик(add)\n6.Завершить программу\nВведите номер: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("1")){
                ArrayList animals_list= new ArrayList();
                ArrayList cmd = new ArrayList();
                AddAnimals animals = new AddAnimals(cmd);
                String x = animals.toString();
                if(animals.getType().equals("PackAnimals")){
                    new database(animals_list,animals.getHumanFriendsPackAnimals());
                } else if (animals.getType().equals("Pets")) {
                    new database(animals_list,animals.getHumanFriendsPets());
                }
                new database_2(animals_list);
            }else if (input.equals("2")){
                System.out.println("Id | Type | Animals_type | Name | BirthOfDay | Commands:");
                new WriteDB();
                System.out.println();
            }else if (input.equals("3")){
                new WriteAnimals();
                System.out.println();
            }else if (input.equals("4")){
                new AddCommands();
            } else if (input.equals("5")) {
                new Counter();
            } else if (input.equals("6")){
                break;
            }else {
                System.out.println("\u001B[31m"+"Некорректный ввод!"+"\u001B[0m");
                System.out.println();
            }
        }
//        ArrayList animals_list= new ArrayList();
//        ArrayList cmd = new ArrayList();
//        AddAnimals animals = new AddAnimals(cmd);
//        System.out.println(cmd);
//        String x = animals.toString();
//        System.out.println(x);
//        if(animals.getType().equals("PackAnimals")){
//            new database(animals_list,animals.getHumanFriendsPackAnimals());
//        } else if (animals.getType().equals("Pets")) {
//            new database(animals_list,animals.getHumanFriendsPets());
//        }
//        System.out.println(animals_list);
//        new database_2(animals_list);

//        System.out.println("Id | Type | Animals_type | Name | BirthOfDay | Commands:");

    }
}
