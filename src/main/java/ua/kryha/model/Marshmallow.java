package ua.kryha.model;

public class Marshmallow extends Sweetness {

    private String color;

    public Marshmallow(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
    }

    @Override
    public void draw() {
        System.out.println("Marshmallow draw");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Marshmallow" + " " + this.getName() + " " + this.getWeight() + " " + this.getSugarContent();
    }
}
