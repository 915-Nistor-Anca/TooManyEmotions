package models;

import java.util.List;
import java.util.Vector;

public class Question {
    private String text;
    private List<Feeling> feelings;

    public Question(String text, List<Feeling> feelings){
        this.text = text;
        this.feelings = feelings;
    }

    String getText(){
        return text;
    }

    List<Feeling> getFeelings(){
        return feelings;
    }
}