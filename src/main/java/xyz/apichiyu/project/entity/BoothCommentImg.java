package xyz.apichiyu.project.entity;

public final class BoothCommentImg extends BaseEntity{
    private String commentId;
    private BoothComment comment;
    private String img;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
