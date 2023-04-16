package hw5.view;

import hw5.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {


   UserController userController =new UserController();
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i < 5; i++) {
        System.out.println("введите Имя");
        String name =sc.next();
        userController.addUser(i, name);
        System.out.println("введите баланс ");
        userController.addBalance(i,name,sc.nextDouble());}
    userController.printUsers();
        System.out.println("______________");
    userController.printBalance();
//        System.out.println("Введите id пользователя");
//        int idUser =sc.nextInt();
//        System.out.println("Введите сумму перевода");
//        double money= sc.nextDouble();
//        userController.depositMoney(idUser,money);
//        userController.printBalance();
        System.out.println("Введите id пользователя");
        int idUser1 =sc.nextInt();
        System.out.println("Введите сумму,которую хотите снять");
        double money1= sc.nextDouble();
        userController.withdrawMoney(idUser1,money1);
        userController.printBalance();


    }

}