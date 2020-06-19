package xyz.apichiyu.project.entity;

public final class GoodsCommentImg extends BaseEntity{
    private String commentId;
    private GoodsComment comment;
    private String img;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public GoodsComment getComment() {
        return comment;
    }

    public void setComment(GoodsComment comment) {
        this.comment = comment;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
