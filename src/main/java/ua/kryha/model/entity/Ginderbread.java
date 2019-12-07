package ua.kryha.model.entity;
import static ua.kryha.view.TextConstants.*;

public class Ginderbread extends Sweetness {

    private boolean hasGinder;
    private boolean hasBaking;

    public Ginderbread(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
        this.hasGinder = getRandomHas(ONE + (int) (Math.random() * TWO));
        this.hasBaking = getRandomHas(ONE + (int) (Math.random() * TWO));
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

    public boolean getRandomHas(int key) {
        return key == 1;
    }



    @Override
    public String toString() {
        return "Ginderbread" + " " + this.getName() + " " + this.getWeight() + " " + this.getSugarContent()
                + " " + this.isHasBaking() + " " + this.isHasGinder();
    }
}
