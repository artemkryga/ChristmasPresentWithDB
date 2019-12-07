package ua.kryha.model.entity;

import static ua.kryha.view.TextConstants.*;

public class Candy extends Sweetness {

    private boolean hasNut;
    private String kindOfChoko;

    public Candy(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
        this.kindOfChoko = getRandomKindOfChoko(ONE + (int) (Math.random() * THREE));
        this.hasNut = getRandomHasNut(ONE + (int) (Math.random() * TWO));
    }


    public boolean isHasNut() {
        return hasNut;
    }

    public void setHasNut(boolean hasNut) {
        this.hasNut = hasNut;
    }

    public String getKindOfChoko() {
        return kindOfChoko;
    }

    public void setKindOfChoko(String kindOfChoko) {
        this.kindOfChoko = kindOfChoko;
    }

    public String getRandomKindOfChoko(int key) {

        if (key == 1) {
            return "white";
        } else if (key == 2)
            return "Milk";
        else return "Dark";

    }

    public boolean getRandomHasNut(int key) {
        return key == 1;
    }

    @Override
    public String toString() {
        return "Candy" + " " + this.getName() + " " + this.getWeight() + " " + this.getSugarContent()
                + " " + this.getKindOfChoko() + " " + this.isHasNut();
    }
}
