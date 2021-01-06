package com.zl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("sl")
    private Integer sl;

    @TableField("jf")
    private Integer jf;

    @TableField("num")
    private Integer num;

    @TableField("price")
    private Integer price;

    @TableField("creatTime")
    private Date creatTime;

    @TableField("zong")
    private Integer zong;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sl=" + sl +
                ", jf=" + jf +
                ", num=" + num +
                ", price=" + price +
                ", creatTime=" + creatTime +
                ", zong=" + zong +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public Integer getJf() {
        return jf;
    }

    public void setJf(Integer jf) {
        this.jf = jf;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getZong() {
        return zong;
    }

    public void setZong(Integer zong) {
        this.zong = zong;
    }

    public Car() {
    }

    public Car(Integer id, String name, Integer sl, Integer jf, Integer num, Integer price, Date creatTime, Integer zong) {
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.jf = jf;
        this.num = num;
        this.price = price;
        this.creatTime = creatTime;
        this.zong = zong;
    }
}
