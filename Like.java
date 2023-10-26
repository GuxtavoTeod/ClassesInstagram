public class Like {
    private int id;
    private String idPost;
    private String post;
    
    public Like(int id, String idPost, String post) {
        this.id = id;
        this.idPost = idPost;
        this.post = post;
    }
    public int getId() {
        return id;
    }
    public String getIdPost() {
        return idPost;
    }
    public String getPost() {
        return post;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }
    public void setPost(String post) {
        this.post = post;
    }
    
}
