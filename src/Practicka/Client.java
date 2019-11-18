package Practicka;

public class Client {
    private int password;
    private int login;
    private int count;

    public Client() {
    }

    public Client(int password, int login, int count) {
        this.password = password;
        this.login = login;
        this.count = count;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Client{" +
                "password=" + password +
                ", login='" + login + '\'' +
                ", count=" + count +
                '}';
    }
}
