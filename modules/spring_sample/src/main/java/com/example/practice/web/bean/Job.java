package com.example.practice.web.bean;

/**
 * 職業を表すクラス
 * @since 2017/10/22
 */
public class Job {

    /**
     * 職業ID
     */
    private int id;

    /**
     * 職業名
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
