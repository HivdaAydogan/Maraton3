package com.yarisma.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbluser")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nameSurname;
    private String email;
    private String password;

    @OneToMany(mappedBy = "olusturan")
    private List<Yarisma> yarismaList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<YarismaKatilim> katilimlar = new ArrayList<>();


    public User(String nameSurname, String email, String password) {
        this.nameSurname = nameSurname;
        this.email = email;
        this.password = password;
    }

    public User(Long id) {
        this.id = id;
    }
}
