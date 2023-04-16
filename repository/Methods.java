package hw5.repository;

import hw5.model.Balance;
import hw5.model.User;

public interface Methods {
     void addUsers(User item);
     void addUsers(Balance item);
     void deleteUsers(int idUser);

    void printUsers();
}
