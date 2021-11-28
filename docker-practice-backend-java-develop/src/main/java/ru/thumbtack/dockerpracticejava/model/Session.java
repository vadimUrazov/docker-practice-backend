package ru.thumbtack.dockerpracticejava.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("sessions")
public class Session extends BaseEntity{

    private String userName;

    private Integer countOfRequests;

}
