package com.springboot.sb_demo.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "countries")
@Data
@ToString
public class Countries {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

}
