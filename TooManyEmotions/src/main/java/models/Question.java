package models;

import java.util.List;

public class Question {
    private String text;
    private List<String> options;

    public Question(String text, List<String> options){
        this.text = text;
        this.options = options;
    }

    String getText(){
        return text;
    }

    List<String> getOptions(){
        return options;
    }
}
