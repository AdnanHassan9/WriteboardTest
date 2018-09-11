package net.writeboard;

import java.util.Date;
import java.util.Map;

public class Post {

    private String postId;
    private int likeCount;
    private Date timeCreated;
    private User user;
    private int commentCount;
    private boolean isMessage;
    private boolean isPhoto;
    private boolean isVideo;
    private boolean isPublic;
    private boolean isPrivate;
    private String caption;
    private String mediaUrl;
    private double mediaSize;
    private Map<String, ?> likes;
    private Map<String, ?> comments;
    private Map<String, ?> recipients;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isMessage() {
        return isMessage;
    }

    public void setMessage(boolean message) {
        isMessage = message;
    }

    public boolean isPhoto() {
        return isPhoto;
    }

    public void setPhoto(boolean photo) {
        isPhoto = photo;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public double getMediaSize() {
        return mediaSize;
    }

    public void setMediaSize(double mediaSize) {
        this.mediaSize = mediaSize;
    }

    public Map<String, ?> getLikes() {
        return likes;
    }

    public void setLikes(Map<String, ?> likes) {
        this.likes = likes;
    }

    public Map<String, ?> getComments() {
        return comments;
    }

    public void setComments(Map<String, ?> comments) {
        this.comments = comments;
    }

    public Map<String, ?> getRecipients() {
        return recipients;
    }

    public void setRecipients(Map<String, ?> recipients) {
        this.recipients = recipients;
    }
}
