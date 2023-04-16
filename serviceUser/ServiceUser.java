package hw5.serviceUser;

import hw5.model.User;
import hw5.repository.UserRepo;

public class ServiceUser {
    private UserRepo userRepo = new UserRepo();
    public void addUser(User user){
        userRepo.addUsers(user);
    }
    public void deleteUser(int idUser){
        userRepo.deleteUsers(idUser);
    }
  public void printUsers(){
        userRepo.printUsers(); }
}
