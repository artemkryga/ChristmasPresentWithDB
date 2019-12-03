package ua.kryha.model;

public class Candy extends Sweetness {

    private boolean hasNut;
    private String kindOfChoko;

    public Candy(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
    }

    @Override
    public void draw() {
        System.out.println("Candy draw");
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

    @Override
    public String toString() {
        return "Candy" + " " + this.getName() + " " + this.getWeight() + " " + this.getSugarContent();
    }
}
