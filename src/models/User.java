package models;

// User.java
public class User {
    private int id;
    private String login;
    private String mdp;

    // Constructeurs, getters et setters
    public User() {}

    public User(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLogin() { return login; }
    public void setLogin(String login ) { this.login = login; }

    public String getMdp() { return mdp; }
    public void setMdp(String mdp) { this.mdp = mdp; }
}

