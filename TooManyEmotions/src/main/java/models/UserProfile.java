package models;

import java.util.Date;

public class UserProfile {
    private User user;
    private String last_test_date;
    private int score;

    public UserProfile(User user, String last_test_date, int score){
        this.user = user;
        this.last_test_date = last_test_date;
        this.score = score;
    }
    public User getUser() {
        return user;
    }

    public int getScore() {
        return score;
    }

    public String getLastTestDate() {
        return last_test_date;
    }

    public void setNewScore(int new_score){
        this.score = new_score;
    }
}
