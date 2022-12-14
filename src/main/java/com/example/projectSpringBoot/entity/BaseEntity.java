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
@MappedSuperclass
public abstract class BaseEntity {
    @Id //khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gía trị tự động tăng
    private long id;

    @Column
    private String createdBy;
    @Column
    private Date createdDate;
    @Column
    private String modifiedBy;
    @Column
    private String modifiedDate;

    public long getId() {
        return id;
    }

}
