package com.chenteng.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "hg_depart")
@Entity
public class Depart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Depart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
