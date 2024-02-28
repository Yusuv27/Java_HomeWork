package First.data;

public class Animals {
protected String type;

public Animals(String type){
    this.type=type;
}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                '}';
    }
}