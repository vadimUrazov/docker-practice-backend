package ru.thumbtack.dockerpracticejava.model;

import lombok.*;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "email")
    private String email;

}
