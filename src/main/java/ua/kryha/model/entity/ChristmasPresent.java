package ua.kryha.model.entity;

import java.util.*;


public class ChristmasPresent {
    private List<Sweetness> sweetnesses;

    public ChristmasPresent(List<Sweetness> sweetnesses) {
        this.sweetnesses = sweetnesses;
    }


    public List<Sweetness> sortSweets() {

        Collections.sort(this.sweetnesses, new Comparator<Sweetness>() {
            public int compare(Sweetness o1, Sweetness o2) {
                return o1.getWeight() - (o2.getWeight());
            }
        });
        return getSweetnesses();
    }

    public List<Sweetness> getSugarRange(int min, int max) {
        List<Sweetness> sweetnesses = new ArrayList<Sweetness>();
        for (Sweetness s : getSweetnesses()) {
            if (s.getWeight() > min && s.getWeight() < max) {
                sweetnesses.add(s);
            }
        }
        return sweetnesses;
    }


    public List<Sweetness> getSweetnesses() {
        return sweetnesses;
    }

}
