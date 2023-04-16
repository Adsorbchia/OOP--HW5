package hw5.repository;

import hw5.model.Balance;
import hw5.model.User;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BalanceRepo implements Methods {
    private Balance balance = new Balance();
    private List<Balance> balanceList;

    public BalanceRepo() {
        this.balanceList = new LinkedList<>();
    }

    public List<Balance> getBalanceList() {
        return balanceList;
    }

    public void setBalanceList(List<Balance> balanceList) {
        this.balanceList = balanceList;
    }

    public void depositMoney(int idUser, double money){
        Iterator<Balance> iterator = balanceList.iterator();
        while (iterator.hasNext()){
            Balance el= iterator.next();
            if (el.getIdUser()==idUser){
                double v = el.getBalance() + money;
                el.setBalance(v);}}}

    public void withdrawMoney(int idUser, double money){ Iterator<Balance> iterator = balanceList.iterator();
        while (iterator.hasNext()){
            Balance el= iterator.next();
            if (el.getIdUser()==idUser){
                double v = el.getBalance() - money;
                el.setBalance(v);}}

    }

    @Override
    public void addUsers(User item) {}

    @Override
    public void addUsers(Balance item) {
        balanceList.add(item);}

    @Override
    public void deleteUsers(int idUser) {
        Iterator <Balance> iterator= balanceList.iterator();
        while (iterator.hasNext()){
            Balance el = iterator.next();
            if(el.getIdUser()==idUser){
                iterator.remove();}}}

    @Override
    public void printUsers() {
        Iterator <Balance> iterator= balanceList.iterator();
        while (iterator.hasNext()){
            Balance el = iterator.next();
            System.out.println(el);}}}

