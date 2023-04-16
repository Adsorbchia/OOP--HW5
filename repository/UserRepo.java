package hw5.repository;

import hw5.model.Balance;
import hw5.model.User;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserRepo implements Methods {

    private User user = new User();
    private List<User> users;
    public UserRepo() {
        this.users = new LinkedList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        for (User user1 : this.users = users) {


        }

    }

    @Override
    public void addUsers(User user) {
        users.add(user);}

    @Override
    public void addUsers(Balance item) {}

    @Override
    public void deleteUsers(int idUser) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
           User el= iterator.next();
            if (el.getIdUser()==idUser){
                iterator.remove();}}}

    @Override
    public void printUsers() {
        Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()){
                User el= iterator.next();
                System.out.println(el);}}}

