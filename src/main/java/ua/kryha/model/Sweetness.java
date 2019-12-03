package ua.kryha.model;

public abstract class Sweetness {

    private String name;
    private int weight;
    private int sugarContent;


    public Sweetness(String name, int weight, int sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarContent=" + sugarContent +
                '}';
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }
}
