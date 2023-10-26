public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    
    public User() {       
        id = 0;
        name = "";
        password = "";
        email = "";
    }
    
    public User(int id, String name, String password, String email) {
        if (name == null || name.length() < 3 || name.length() > 20) {
            throw new IllegalArgumentException("Nome de usuário inválido");
        }
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}