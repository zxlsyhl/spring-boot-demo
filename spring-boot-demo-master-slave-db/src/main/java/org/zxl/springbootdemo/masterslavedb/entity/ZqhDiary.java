package org.zxl.springbootdemo.masterslavedb.entity;

/**
 * Created by 123456 on 2019/7/2.
 */
public class ZqhDiary {
    private int id;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZqhDiary(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ZqhDiary() {
    }
}
