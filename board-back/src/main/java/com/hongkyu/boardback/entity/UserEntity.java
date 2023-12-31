package com.hongkyu.boardback.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class UserEntity {
    
    @Id
    private String email;
    private String password;
    private String nickname;
    private String telNumber;
    private String address;
    private String address_detail;
    private String profileImage;
}
