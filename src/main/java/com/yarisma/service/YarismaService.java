package com.yarisma.service;

import com.yarisma.entity.Yarisma;
import com.yarisma.repository.YarismaRepository;
import com.yarisma.util.MyFactoryService;

public class YarismaService extends MyFactoryService<YarismaRepository, Yarisma, Long> {

    public YarismaService() {
        super(new YarismaRepository());
    }
}
