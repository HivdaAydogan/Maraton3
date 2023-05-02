package com.yarisma.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tblyarisma")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long startTime;

    @Column(nullable = false)
    private Long endTime;

    @Column(nullable = false)
    private int katilimciSayisi;

    private Long prize;

    @ManyToOne
    @JoinColumn(name = "olusturan_id")
    private User olusturan;

    @OneToMany(mappedBy = "yarisma")
    private List<YarismaKatilim> katilimlar = new ArrayList<>();


    public Yarisma(Long startTime, Long endTime, int katilimciSayisi, Long prize, User olusturan) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.katilimciSayisi = katilimciSayisi;
        this.prize = prize;
        this.olusturan = olusturan;
    }
}
