package com.example.EnumJwt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name="roles")
    public class Role {
        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
        private Long Id;

        @Enumerated(EnumType.STRING)
        @Column(length = 20)
        private ERole name;

//    public Role() {
//
//    }


//    public Role(ERoles name){
//        this.name = name;
//    }
//
//    public Long getId() {
//        return Id;
//    }
//
//    public void setId(Long id) {
//        Id = id;
//    }
//
//    public ERoles getName() {
//        return name;
//    }
//
//    public void setName(ERoles name) {
//        this.name = name;
//    }
    }


