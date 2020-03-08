package kz.attractorschool.microgram.model;

import java.time.LocalDateTime;

public class LikeModel{

        private int idLike;
        private User whoLikes;
        private Publication whatLikes;
        private LocalDateTime timeLike;


    public LikeModel(int idLike, User whoLikes, Publication whatLikes,LocalDateTime timeLike){
        this.idLike=idLike;
        this.whoLikes=whoLikes;
        this.whatLikes=whatLikes;
        this.timeLike=timeLike;
    }


        public int getIdLike() {
            return idLike;
        }
        public void setIdLike(int idLike) {
            this.idLike = idLike;
        }
        public User getWhoLikes() {
            return whoLikes;
        }

        public void setWhoLikes(User whoLikes) {
            this.whoLikes = whoLikes;
        }

        public Publication getWhatLikes() {
            return whatLikes;
        }

        public void setWhatLikes(Publication whatLikes) {
            this.whatLikes = whatLikes;
        }

        public LocalDateTime getTimeLike() {
            return timeLike;
        }

        public void setTimeLike(LocalDateTime timeLike) {
            this.timeLike = timeLike;
        }


}