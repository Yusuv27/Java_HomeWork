package First.data;

import java.util.ArrayList;
import java.util.HashSet;

public class Human_friends_Pets {
    protected String name;
    protected String dateOfBirth;
    protected ArrayList commands;
    protected Pets pets;
    public Human_friends_Pets(){}
    public Human_friends_Pets(String type_animals, String name,String dateOfBirth,ArrayList commands){
        this.pets=new Pets(type_animals);
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.commands=commands;
    }
    public Human_friends_Pets(Pets pets, String name,String dateOfBirth,ArrayList commands){
        this.pets=pets;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.commands=commands;
    }
    public String getType_animals(){
        return pets.getType_animals();
    }
    public String getType(){
        return pets.getType();
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

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }
    public void setSetting(Pets pets, String name,String dateOfBirth,ArrayList commands){
        this.pets=pets;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.commands=commands;
    }

    @Override
    public String toString() {
        return "Human_friends_Pets\n" +
                "name= " + name + '\n' +
                "dateOfBirth= " + dateOfBirth + '\n' +
                "commands= " + commands+'\n';
    }
}
