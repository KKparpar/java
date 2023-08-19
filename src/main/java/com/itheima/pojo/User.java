package com.itheima.pojo;

public class User {
    private Integer id;
    private String nam;

    public User() {
    }

    public User(Integer id, String nam) {
        this.id = id;
        this.nam = nam;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return nam
     */
    public String getNam() {
        return nam;
    }

    /**
     * 设置
     * @param nam
     */
    public void setNam(String nam) {
        this.nam = nam;
    }

    public String toString() {
        return "User{id = " + id + ", nam = " + nam + "}";
    }
}
