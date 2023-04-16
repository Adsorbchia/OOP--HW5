package hw5.serviceUser;

import hw5.model.Balance;
import hw5.model.User;
import hw5.repository.BalanceRepo;
import hw5.repository.UserRepo;

public class BalanceService {
    private BalanceRepo balanceRepo = new BalanceRepo();
    public void addBalance(Balance balance){
        balanceRepo.addUsers(balance);}
    public void deleteUser(int idUser){
        balanceRepo.deleteUsers(idUser);
    }

    public void depositMoney(int idUser, double money){
        balanceRepo.depositMoney(idUser,money);
    }
    public void withdrawMoney(int idUser, double money){
        balanceRepo.withdrawMoney(idUser,money);
    }
    public void printBalance(){
        balanceRepo.printUsers();}

    }
