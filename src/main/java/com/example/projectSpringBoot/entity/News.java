package com.example.projectSpringBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "news")
public class News extends  BaseEntity  {
    @Column(name = "title")
    private String title;
    @Column(name = "thumbnail")
    private String thumbNail;
    @Column(name = "shortdescription")
    private String shortDescription;
    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
