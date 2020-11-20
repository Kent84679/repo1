package com.zy.bean;

import java.io.Serializable;

public class Press implements Serializable{
    private Integer id;
    private String press_name;
    private String press_address;

    @Override
    public String toString() {
        return "Press{" +
                "id=" + id +
                ", press_name='" + press_name + '\'' +
                ", press_address='" + press_address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPress_name() {
        return press_name;
    }

    public void setPress_name(String press_name) {
        this.press_name = press_name;
    }

    public String getPress_address() {
        return press_address;
    }

    public void setPress_address(String press_address) {
        this.press_address = press_address;
    }
}

