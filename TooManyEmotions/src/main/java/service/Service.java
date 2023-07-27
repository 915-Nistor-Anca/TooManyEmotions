package service;

import models.User;
import models.UserProfile;
import repository.Repository;

public class Service {
    private Repository repo;
    public UserProfile getUserProfile(String username){
        for(UserProfile u: repo.getUserProfileList()){
            if (u.getUser().getUsername() == username) return u;
        }
        User u = new User("-1", "-1", "-1");
        UserProfile up = new UserProfile(u, "01-01-2010", 0);
        return up;
    }
}
