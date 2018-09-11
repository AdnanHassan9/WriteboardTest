package net.writeboard;

public class Notification {

    private String notifId;
    private String userId;
    private int timeCreated;
    private boolean hasSeen;
    private boolean isNewLike;
    private boolean isNewComment;
    private boolean isCommentMention;
    private boolean isPostMention;
    private boolean isPrivateMessage;
    private boolean isNewFollower;

    private String notifierUsername;
    private String notifierUserId;
    private String notifierProfileImage;
    private Post post;

    public String getNotifId() {
        return notifId;
    }

    public void setNotifId(String notifId) {
        this.notifId = notifId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(int timeCreated) {
        this.timeCreated = timeCreated;
    }

    public boolean isHasSeen() {
        return hasSeen;
    }

    public void setHasSeen(boolean hasSeen) {
        this.hasSeen = hasSeen;
    }

    public boolean isNewLike() {
        return isNewLike;
    }

    public void setNewLike(boolean newLike) {
        isNewLike = newLike;
    }

    public boolean isNewComment() {
        return isNewComment;
    }

    public void setNewComment(boolean newComment) {
        isNewComment = newComment;
    }

    public boolean isCommentMention() {
        return isCommentMention;
    }

    public void setCommentMention(boolean commentMention) {
        isCommentMention = commentMention;
    }

    public boolean isPostMention() {
        return isPostMention;
    }

    public void setPostMention(boolean postMention) {
        isPostMention = postMention;
    }

    public boolean isPrivateMessage() {
        return isPrivateMessage;
    }

    public void setPrivateMessage(boolean privateMessage) {
        isPrivateMessage = privateMessage;
    }

    public boolean isNewFollower() {
        return isNewFollower;
    }

    public void setNewFollower(boolean newFollower) {
        isNewFollower = newFollower;
    }

    public String getNotifierUsername() {
        return notifierUsername;
    }

    public void setNotifierUsername(String notifierUsername) {
        this.notifierUsername = notifierUsername;
    }

    public String getNotifierUserId() {
        return notifierUserId;
    }

    public void setNotifierUserId(String notifierUserId) {
        this.notifierUserId = notifierUserId;
    }

    public String getNotifierProfileImage() {
        return notifierProfileImage;
    }

    public void setNotifierProfileImage(String notifierProfileImage) {
        this.notifierProfileImage = notifierProfileImage;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
