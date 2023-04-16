package hw5.model;

public class User {
    private int idUser;
    private String name;


    public User(int idUser, String name) {
        this.idUser = idUser;
        this.name = name;
    }

    public User() {

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", " +
                '}';
    }
}
