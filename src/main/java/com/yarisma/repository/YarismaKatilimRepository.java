package com.yarisma.repository;

import com.yarisma.entity.YarismaKatilim;
import com.yarisma.util.MyFactoryRepository;

public class YarismaKatilimRepository extends MyFactoryRepository<YarismaKatilim, Long> {

    public YarismaKatilimRepository() {
        super(new YarismaKatilim());
    }
}
