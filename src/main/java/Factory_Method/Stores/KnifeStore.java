package Factory_Method.Stores;

import Factory_Method.Knifes.Knife;

public abstract class KnifeStore {
    public Knife orderKnife(String type) {
        Knife knife = null;
        knife = createKnife(type);
        knife.sharpen();
        knife.polish();
        knife.wrapp();
        return knife;
    }
    abstract Knife createKnife(String type);
}