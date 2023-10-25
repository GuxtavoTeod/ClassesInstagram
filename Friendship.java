public class Friendship {
    private int id;
    private String status;
    private String idFriend;
    private String profileFriend;
    private String date;
    
    public Friendship(int id, String status, String idFriend, String profileFriend, String date) {
        this.id = id;
        this.status = status;
        this.idFriend = idFriend;
        this.profileFriend = profileFriend;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getIdFriend() {
        return idFriend;
    }

    public String getProfileFriend() {
        return profileFriend;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIdFriend(String idFriend) {
        this.idFriend = idFriend;
    }

    public void setProfileFriend(String profileFriend) {
        this.profileFriend = profileFriend;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
