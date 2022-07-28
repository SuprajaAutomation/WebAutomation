package xpath;

import base.Test;
import constants.Keys;

public class Contains {

    private String text;

    public Contains(String text){
        setText(text.trim());
    }

    public String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

    public static Contains name(String name){
        return new Contains("[contains(@name,'"+name+"')]");
    }

    public static Contains text(String text){
        return new Contains("[contains(@text,'"+text+"')]");
    }


}
