package xpath;

import base.Test;
import constants.Keys;

public class Matching {

    private String text;

    public Matching(String text){
        setText(text.trim());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static Matching name(String name){
        return new Matching("[@name='"+name+"']");
    }

    public static Matching text(String text){
        return new Matching("[@text='"+text+"']");
    }


}