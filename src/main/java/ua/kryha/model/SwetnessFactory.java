package ua.kryha.model;

public class SwetnessFactory {

    public Sweetness getSweetness(SweetnessType type , String name , int weight , int sugarContent) {
        Sweetness toReturn = null;
        switch (type) {
            case CANDY:
                toReturn = new Candy(name , weight , sugarContent);
                break;
            case GINDERBREAD:
                toReturn = new Ginderbread(name , weight , sugarContent);
                break;
            case MARSHMALLOW:
                toReturn = new Marshmallow(name , weight , sugarContent);
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}
