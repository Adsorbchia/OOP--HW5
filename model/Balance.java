package hw5.model;

public class Balance extends User{
 private double balance;

    public Balance(int idUser, String name, double balance) {
        super(idUser, name);
        this.balance = balance;
    }

    public Balance() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "idUser{" + getIdUser()+ " "+
                "balance=" + balance +
                '}';
    }


}
