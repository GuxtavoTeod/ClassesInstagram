public class Comment {
    private int id;
    private int idUser;
    private String text;
    private String data;
    
    public Comment(int id, int idUser, String text, String data) {
        this.id = id;
        this.idUser = idUser;
        this.text = text;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getText() {
        return text;
    }

    public String getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
