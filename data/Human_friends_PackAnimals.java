package First.data;

import java.util.ArrayList;
import java.util.HashSet;

public class Human_friends_PackAnimals {
    protected String name;
    protected String dateOfBirth;
    protected ArrayList commands;
    protected PackAnimals packAnimals;
    public Human_friends_PackAnimals(){}
    public Human_friends_PackAnimals(String type_animals, String name,String dateOfBirth,ArrayList commands){
        this.packAnimals=new PackAnimals(type_animals);
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.commands=commands;
    }
    public Human_friends_PackAnimals(PackAnimals packAnimals, String name,String dateOfBirth,ArrayList commands){
        this.packAnimals=packAnimals;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.commands=commands;
    }
    public String getType_animals(){
        return packAnimals.getType_animals();
    }
    public String getType(){
        return packAnimals.getType();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList getCommands() {
        return commands;
    }

    public void setCommands(ArrayList commands) {
        this.commands = commands;
    }

    public PackAnimals getPackAnimals() {
        return packAnimals;
    }
    public void setPackAnimals(PackAnimals packAnimals) {
        this.packAnimals = packAnimals;
    }
    public void setSetting(PackAnimals packAnimals, String name,String dateOfBirth,ArrayList commands){
        this.packAnimals=packAnimals;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.commands=commands;
    }


    @Override
    public String toString() {
        return "Human_friends_PackAnimals\n" +
                "name= " + name + '\n' +
                "dateOfBirth= " + dateOfBirth + '\n' +
                "commands= " + commands+'\n';
    }

}