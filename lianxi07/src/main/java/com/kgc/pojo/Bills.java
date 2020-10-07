package com.kgc.pojo;

import java.util.Date;

public class Bills {
    private Integer id;

    private String title;

    private String billtime;

    private Integer typeid;

    private Integer price;

    private String explains;

    private String typename;
    public Bills() {
    }

    public Bills(String title, String billtime, Integer typeid, Integer price, String explains) {
        this.title = title;
        this.billtime = billtime;
        this.typeid = typeid;
        this.price = price;
        this.explains = explains;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBilltime() {
        return billtime;
    }

    public void setBilltime(String billtime) {
        this.billtime = billtime;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains == null ? null : explains.trim();
    }
}