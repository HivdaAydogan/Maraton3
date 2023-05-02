package com.yarisma.controller;

import com.yarisma.entity.User;
import com.yarisma.entity.Yarisma;
import com.yarisma.service.YarismaService;
import com.yarisma.util.HibernateUtility;
import org.hibernate.Session;

public class YarismaController {

    private YarismaService yarismaService;

    public YarismaController(){
        this.yarismaService = new YarismaService();
    }

    public void saveYarisma(Yarisma yarisma){
       yarismaService.save(yarisma);
    }



}
