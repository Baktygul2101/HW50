package kz.attractorschool.microgram.model;

import java.time.LocalDateTime;

public class SubscriptionModel{
    private User userWhoSubs;
    private User userWhom;
    private LocalDateTime timeSub;

    SubscriptionModel(User userWhoSubs,User userWhom, LocalDateTime timeSub){
        this.userWhoSubs=userWhoSubs;
        this.userWhom=userWhom;
        this.timeSub=timeSub;
    }

    public User getUserWhom() {
        return userWhom;
    }

    public void setTimeSub(LocalDateTime timeSub) {
        this.timeSub = timeSub;
    }

    public User getUserWhoSubs() {
        return userWhoSubs;
    }

    public void setUserWhoSubs(User userWhoSubs) {
        this.userWhoSubs = userWhoSubs;
    }

    public void setUserWhom(User userWhom) {
        this.userWhom = userWhom;
    }

    public LocalDateTime getTimeSub() {
        return timeSub;
    }
}