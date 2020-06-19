package xyz.apichiyu.project.entity;

public final class BoothCommentReply extends BaseEntity{
    private String commentId;
    private BoothComment comment;
    private String content;
    private long time;
    private boolean active;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public BoothComment getComment() {
        return comment;
    }

    public void setComment(BoothComment comment) {
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
