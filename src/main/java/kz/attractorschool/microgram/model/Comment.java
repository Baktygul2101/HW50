package kz.attractorschool.microgram.model;
import java.time.LocalDateTime;

public class Comment {
    private int idComment;
    private String commentText;
    private LocalDateTime timeCom;
    private User author;
    public Comment(int idComment, String commentText, LocalDateTime timeCom, User author) {
        this.idComment= idComment;
        this.commentText = commentText;
        this.timeCom = timeCom;
        this.author=author;
    }
    public Comment() {

    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getTimeCom() {
        return timeCom;
    }

    public void setTimeCom(LocalDateTime timeCom) {
        this.timeCom = timeCom;
    }
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}