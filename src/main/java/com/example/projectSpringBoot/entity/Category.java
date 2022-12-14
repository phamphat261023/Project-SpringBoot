package com.example.projectSpringBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category")
public class Category extends  BaseEntity  {
    @Column
    private String code;
    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private List<News> listnew = new ArrayList<>();
}
