package First.Funcional;
import java.time.Year;
import First.data.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AddAnimals {
    protected boolean aBoolean=true;
    protected String type;
    protected Human_friends_Pets humanFriendsPets = new Human_friends_Pets();
    protected Human_friends_PackAnimals humanFriendsPackAnimals = new Human_friends_PackAnimals();
    public AddAnimals(ArrayList cmd) {
        AddAnimals(cmd);
    }


    public String getType() {
        return type;
    }

    public Human_friends_Pets getHumanFriendsPets() {
        return humanFriendsPets;
    }

    public Human_friends_PackAnimals getHumanFriendsPackAnimals() {
        return humanFriendsPackAnimals;
    }

    public Object AddAnimals(ArrayList cmd){
        System.out.println("Введите животное: Собака,Кошка и тд");
        Scanner scanner = new Scanner(System.in);
        String animals_type=scanner.nextLine();
        while (true) {
            System.out.println("Введите тип животного: Pets/PackAnimals");
            Scanner scanner2 = new Scanner(System.in);
            this.type = scanner2.nextLine();
            if (type.equals("Pets")) {
                this.aBoolean=true;
                Pets pets = new Pets(animals_type);
                System.out.println("Введите имя животного:");
                Scanner name_scanner = new Scanner(System.in);
                String name = name_scanner.nextLine();
                String day_dateOfBirth;
                while (true) {
                    System.out.println("Введите день рождения животного(число): ");
                    Scanner day_dateOfBirth_scanner = new Scanner(System.in);
                    day_dateOfBirth = day_dateOfBirth_scanner.nextLine();
                    try {
                        if (Integer.parseInt(day_dateOfBirth) < 1) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть ниже единицы!"+"\u001B[0m");
                        } else if (Integer.parseInt(day_dateOfBirth) > 31) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть больше 31!"+"\u001B[0m");
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31m"+"Некорректный ввод дня рождения!"+"\u001B[0m");
                    }
                }
                String month_dateOfBirth;
                while (true) {
                    System.out.println("Введите месяц рождения животного(число): ");
                    Scanner month_dateOfBirth_scanner = new Scanner(System.in);
                    month_dateOfBirth = month_dateOfBirth_scanner.nextLine();
                    try {
                        if (Integer.parseInt(month_dateOfBirth) < 1) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть ниже единицы!"+"\u001B[0m");
                        } else if (Integer.parseInt(month_dateOfBirth) > 12) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть больше 12!"+"\u001B[0m");
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31m"+"Некорректный ввод месяца рождения!"+"\u001B[0m");
                    }
                }
                String year_dateOfBirth;
                while (true) {
                    System.out.println("Введите год рождения животного: ");
                    Scanner year_dateOfBirth_scanner = new Scanner(System.in);
                    year_dateOfBirth = year_dateOfBirth_scanner.nextLine();
                    try {
                        int currentYear = Year.now().getValue();
                        if (Integer.parseInt(year_dateOfBirth) > currentYear) {
                            System.out.println("\u001B[31m"+"Некорректный ввод года рождения! Год не должен быть больше текущего: " + currentYear+"\u001B[0m");
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31m"+"Некорректный ввод года рождения!"+"\u001B[0m");
                    }
                }
                StringBuilder sb_dateOfBirth = new StringBuilder(day_dateOfBirth);
                sb_dateOfBirth.append("/");
                sb_dateOfBirth.append(month_dateOfBirth);
                sb_dateOfBirth.append("/");
                sb_dateOfBirth.append(year_dateOfBirth);
                String dateOfBirth = sb_dateOfBirth.toString();
                System.out.println("Введите команду/команды:");
                while (true) {
                    Scanner commands_scanner = new Scanner(System.in);
                    String commands = commands_scanner.nextLine();
                    cmd.add(commands);
                    System.out.println("Хотите еще добавить, отправьте любое значение:(Если хотите остановить, напишите end)");
                    Scanner result_scanner = new Scanner(System.in);
                    String result_connect = result_scanner.nextLine();
                    if (result_connect.equals("end")) {
                        this.humanFriendsPets = new Human_friends_Pets(pets, name, dateOfBirth, cmd);
                        humanFriendsPets.setSetting(pets, name, dateOfBirth, cmd);
                        return humanFriendsPets;
                    } else {
                        System.out.println("Продолжаем");
                    }
                }
            } else if (type.equals("PackAnimals")) {
                this.aBoolean = false;
                PackAnimals packAnimals = new PackAnimals(animals_type);
                System.out.println("Введите имя животного:");
                Scanner name_scanner = new Scanner(System.in);
                String name = name_scanner.nextLine();
                String day_dateOfBirth;
                while (true) {
                    System.out.println("Введите день рождения животного(число): ");
                    Scanner day_dateOfBirth_scanner = new Scanner(System.in);
                    day_dateOfBirth = day_dateOfBirth_scanner.nextLine();
                    try {
                        if (Integer.parseInt(day_dateOfBirth) < 1) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть ниже единицы!"+"\u001B[0m");
                        } else if (Integer.parseInt(day_dateOfBirth) > 31) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть больше 31!"+"\u001B[0m");
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31m"+"Некорректный ввод дня рождения!"+"\u001B[0m");
                    }
                }
                String month_dateOfBirth;
                while (true) {
                    System.out.println("Введите месяц рождения животного(число): ");
                    Scanner month_dateOfBirth_scanner = new Scanner(System.in);
                    month_dateOfBirth = month_dateOfBirth_scanner.nextLine();
                    try {
                        if (Integer.parseInt(month_dateOfBirth) < 1) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть ниже единицы!"+"\u001B[0m");
                        } else if (Integer.parseInt(month_dateOfBirth) > 12) {
                            System.out.println("\u001B[31m"+"Некорректный ввод! Число не может быть больше 12!"+"\u001B[0m");
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31m"+"Некорректный ввод месяца рождения!"+"\u001B[0m");
                    }
                }
                String year_dateOfBirth;
                while (true) {
                    System.out.println("Введите год рождения животного: ");
                    Scanner year_dateOfBirth_scanner = new Scanner(System.in);
                    year_dateOfBirth = year_dateOfBirth_scanner.nextLine();
                    try {
                        int currentYear = Year.now().getValue();
                        if (Integer.parseInt(year_dateOfBirth) > currentYear) {
                            System.out.println("\u001B[31m"+"Некорректный ввод года рождения! Год не должен быть больше текущего: " + currentYear+"\u001B[0m");
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31m"+"Некорректный ввод года рождения!"+"\u001B[0m");
                    }
                }
                StringBuilder sb_dateOfBirth = new StringBuilder(day_dateOfBirth);
                sb_dateOfBirth.append("/");
                sb_dateOfBirth.append(month_dateOfBirth);
                sb_dateOfBirth.append("/");
                sb_dateOfBirth.append(year_dateOfBirth);
                String dateOfBirth = sb_dateOfBirth.toString();
                System.out.println("Введите команду/команды:");
                while (true) {
                    Scanner commands_scanner = new Scanner(System.in);
                    String commands = commands_scanner.nextLine();
                    cmd.add(commands);
                    System.out.println("Хотите еще добавить, отправьте любое значение:(Если хотите остановить, напишите end)");
                    Scanner result_scanner = new Scanner(System.in);
                    String result_connect = result_scanner.nextLine();
                    if (result_connect.equals("end")) {
                        this.humanFriendsPackAnimals = new Human_friends_PackAnimals(packAnimals, name, dateOfBirth, cmd);
                        humanFriendsPackAnimals.setSetting(packAnimals, name, dateOfBirth, cmd);
                        return humanFriendsPackAnimals;
                    } else {
                        System.out.println("Продолжаем");
                    }
                }
            } else {
                System.out.println("Некорректный ввод");
            }
        }

    }

    @Override
    public String toString() {
        if (aBoolean){
            return ""+humanFriendsPets;
        }else {
            return "" + humanFriendsPackAnimals;
        }
    }
}

