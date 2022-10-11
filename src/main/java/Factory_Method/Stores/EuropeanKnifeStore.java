package Factory_Method.Stores;

import Factory_Method.Knifes.EuropeChefKnife;
import Factory_Method.Knifes.EuropeSteakKnife;
import Factory_Method.Knifes.Knife;

public class EuropeanKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        } else if (type.equals("steak")) {
            return new EuropeSteakKnife();
        } else return null;
    }
}
