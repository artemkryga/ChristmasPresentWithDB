package ua.kryha.model;


public class Ginderbread extends Sweetness {
    int a = 1;
    int b = 2;
    private boolean hasGinder;
    private boolean hasBaking;

    public Ginderbread(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
        this.hasGinder = getRandomHasGinder(a + (int)(Math.random() * b));
        this.hasBaking = getRandomHasBaking(a + (int)(Math.random() * b));
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

    public boolean getRandomHasBaking(int key){
        return key == 1;
    }

    public boolean getRandomHasGinder(int key){
        return key == 1;
    }
    @Override
    public String toString() {
        return "Ginderbread" + " " + this.getName() + " " + this.getWeight() + " " + this.getSugarContent()
                + " " + this.isHasBaking() + " " + this.isHasGinder();
    }
}
