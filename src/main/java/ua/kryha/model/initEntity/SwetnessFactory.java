package ua.kryha.model.initEntity;

import ua.kryha.model.entity.Candy;
import ua.kryha.model.entity.Ginderbread;
import ua.kryha.model.entity.Marshmallow;
import ua.kryha.model.entity.Sweetness;


public class SwetnessFactory { public Sweetness getSweetness(SweetnessType type , String name , int weight , int sugarContent) {
        Sweetness toReturn;
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
