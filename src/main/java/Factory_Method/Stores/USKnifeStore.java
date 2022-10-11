package Factory_Method.Stores;

import Factory_Method.Knifes.Knife;
import Factory_Method.Knifes.USChefKnife;
import Factory_Method.Knifes.USSteakKnife;

public class USKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new USChefKnife();
        } else if (type.equals("steak")) {
            return new USSteakKnife();
        } else return null;
    }
}
