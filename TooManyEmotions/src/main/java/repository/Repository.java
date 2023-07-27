package repository;

import models.Question;
import models.User;
import models.UserProfile;

import java.util.List;

public class Repository {
    private List<UserProfile> userProfileList;
    private List<Question> questions;
    public List<UserProfile> getUserProfileList(){
        return userProfileList;
    }
    public List<Question> getQuestions(){
        return questions;
    }
}
