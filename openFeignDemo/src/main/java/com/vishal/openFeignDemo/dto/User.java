package com.vishal.openFeignDemo.dto;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Vishal Sharma
 * @created 26/09/2020 - 8:13 PM
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "remarks", nullable = true, length = 150)
    private String remarks;

}
