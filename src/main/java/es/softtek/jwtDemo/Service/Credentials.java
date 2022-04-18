package es.softtek.jwtDemo.Service;

class  Credentials{
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
