package First.data;

public class PackAnimals {
    protected String type_animals;
    protected Animals animals=new Animals("PackAnimals");

    public PackAnimals(String type_animals){
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
}
