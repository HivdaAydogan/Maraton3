package com.yarisma;

import com.yarisma.controller.UserController;
import com.yarisma.controller.YarismaController;
import com.yarisma.controller.YarismaKatilimController;
import com.yarisma.entity.User;
import com.yarisma.entity.Yarisma;
import com.yarisma.entity.YarismaKatilim;
import com.yarisma.service.YarismaKatilimService;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
        //User user1 = new User("Mehmet Emin", "mehmet@gmail.com", "345");
        //userController.saveUser(user1);


        YarismaController yarismaController = new YarismaController();
        //Yarisma yarisma1 = new Yarisma(20230205L,20230215L,3,15000L,user1);
        //yarismaController.saveYarisma(yarisma1);


        User user2 = new User("Hivda Aydoğan","hivda@gmail.com","1234");
        userController.saveUser(user2);

        Yarisma yarisma2 = new Yarisma(20230210L,20230220L,5,10000L,user2);
        yarismaController.saveYarisma(yarisma2);













    }
}