public class Profile {
    private int id;
    private String info;
    private String description;
    private int numberOfFollowers;
    private String posts;

    public Profile(int id, String info, String description, int numberOfFollowers, String posts) {
        this.id = id;
        this.info = info;
        this.description = description;
        this.numberOfFollowers = numberOfFollowers;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public String getPosts() {
        return posts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }
    
    public void setPosts(String posts) {
        this.posts = posts;
    }
   
}
