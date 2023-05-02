package com.yarisma.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblyarismakatilim")
public class YarismaKatilim {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long date;

    @ManyToOne
    @JoinColumn(name = "yarisma_id")
    private Yarisma yarisma;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
