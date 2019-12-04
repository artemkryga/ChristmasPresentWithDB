package ua.kryha.model;

import java.util.List;

public class ChristmasPresent {
    private List<Sweetness> sweetnesses;

    public ChristmasPresent(List<Sweetness> sweetnesses) {
        this.sweetnesses = sweetnesses;
    }




    public List<Sweetness> getSweetnesses() {
        return sweetnesses;
    }

}
