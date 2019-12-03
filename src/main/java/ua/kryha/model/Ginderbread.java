package ua.kryha.model;

public class Ginderbread extends Sweetness {

    private boolean hasGinder;
    private boolean hasBaking;

    public Ginderbread(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
    }

    @Override
    public void draw() {
        System.out.println("Ginderbread draw");
    }

    public boolean isHasGinder() {
        return hasGinder;
    }

    public void setHasGinder(boolean hasGinder) {
        this.hasGinder = hasGinder;
    }

    public boolean isHasBaking() {
        return hasBaking;
    }

    public void setHasBaking(boolean hasBaking) {
        this.hasBaking = hasBaking;
    }
}
