package com.springboot.boilerplate.springbootboilerplate.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @NotBlank
    @Size(min = 3, max = 60)
    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @NotBlank
    @Size(min = 3, max = 20)
    @Column(name = "username", nullable = false, length = 20, unique = true)
    private String username;

    @NotBlank
    @Size(min = 6, max = 30)
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank
    @Size(min = 3, max = 20)
    @Column(name = "city", nullable = false, length = 20)
    private String city;

    @NotBlank
    @Size(min = 3, max = 40)
    @Column(name = "address", nullable = false, length = 20)
    private String address;

    @Column(name = "deleted")
    private Boolean deleted = false;
}