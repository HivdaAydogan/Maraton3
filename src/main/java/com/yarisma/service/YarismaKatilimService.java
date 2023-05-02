package com.yarisma.service;

import com.yarisma.entity.User;
import com.yarisma.entity.YarismaKatilim;
import com.yarisma.repository.YarismaKatilimRepository;
import com.yarisma.util.MyFactoryService;

public class YarismaKatilimService extends MyFactoryService<YarismaKatilimRepository, YarismaKatilim, Long> {

    public YarismaKatilimService() {
        super(new YarismaKatilimRepository());
    }


}
