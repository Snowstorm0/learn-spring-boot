package com.spring.boot.dao.model;


import lombok.Data;

@Data
public class UserDTO {

    private Integer number;
    private String name;

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
