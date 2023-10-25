public class Post {
    private int id;
    private String text;
    private String image;
    private String date;
    private String video;
    
    public Post(int id, String text, String image, String date, String video) {
        this.id = id;
        this.text = text;
        this.image = image;
        this.date = date;
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }

    public String getVideo() {
        return video;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVideo(String video) {
        this.video = video;
    }

}
