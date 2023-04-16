package hw5.controller;

import hw5.model.Balance;
import hw5.model.User;
import hw5.serviceUser.BalanceService;
import hw5.serviceUser.ServiceUser;

public class UserController {
    private ServiceUser serviceUser = new ServiceUser();
    private BalanceService balanceService = new BalanceService();
    public void addUser(int idUser, String name){
        serviceUser.addUser(new User(idUser,name));
    }
    public void deleteUser(int idUser){
        serviceUser.deleteUser(idUser);
    }
    public void printUsers(){
        serviceUser.printUsers();
    }

    public void addBalance(int idUser, String name, double balance){
        balanceService.addBalance(new Balance(idUser,name,balance));}

    public void deleteBalance(int idUser){
        balanceService.deleteUser(idUser);}

    public void depositMoney(int idUser,double money){
        balanceService.depositMoney(idUser,money);}
    public void withdrawMoney(int idUser,double money){
        balanceService.withdrawMoney(idUser,money);
    }

    public void printBalance(){
        balanceService.printBalance();
    }

    }

