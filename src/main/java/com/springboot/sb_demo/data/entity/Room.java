package com.springboot.sb_demo.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="rooms")
@Data
@ToString
public class Room {

    @Id
    @Column(name="room_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="room_number")
    private String roomNumber;
    @Column(name="bed_info")
    private String bedInfo;
}
