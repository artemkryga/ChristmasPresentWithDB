package ua.kryha.model;

import java.util.Random;

public class Marshmallow extends Sweetness {
    int a = 1;
    int b = 2;
    private String color;

    public Marshmallow(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
        this.color = getRandomColor(a + (int)(Math.random() * b));
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
        return "Marshmallow" + " " + this.getName() + " " + this.getWeight() + " " + this.getSugarContent()
                + " " + this.getColor();
    }

    public String getRandomColor(int key) {
        if (key == 1){
            return "White";
        }
        else
        return "Pink";
    }
}
