package First.data;

public class Pets {
    protected String type_animals;
    protected Animals animals=new Animals("Pets");

    public Pets(String type_animals){
        this.type_animals=type_animals;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }
    public String getType(){
        return animals.getType();
    }

    public String getType_animals() {
        return type_animals;
    }

    public void setType_animals(String type_animals) {
        this.type_animals = type_animals;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "type_animals='" + type_animals + '\'' +
                ", animals=" + animals +
                '}';
    }
}
