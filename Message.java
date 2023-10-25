public class Message {
    private int id;
    private int idUser;
    private String status;
    private String date;
    
    public Message(int id, int idUser, String status, String date) {
        this.id = id;
        this.idUser = idUser;
        this.status = status;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public int getIdUser() {
        return idUser;
    }
    public String getStatus() {
        return status;
    }
    public String getDate() {
        return date;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
