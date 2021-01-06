package com.zl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("num")
    private Integer num;

    @TableField("name")
    private String name;

    @TableField("price")
    private Integer price;

    @TableField("jj")
    private String jj;

    @TableField("zname")
    private String zname;

    @TableField("sl")
    private Integer sl;

    @TableField("fid")
    private Integer fid;

    @TableField(exist = false)
    private String fname;

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", jj='" + jj + '\'' +
                ", zname='" + zname + '\'' +
                ", sl=" + sl +
                ", fid=" + fid +
                ", fname='" + fname + '\'' +
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getJj() {
        return jj;
    }

    public void setJj(String jj) {
        this.jj = jj;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Shop() {
    }

    public Shop(Integer id, Integer num, String name, Integer price, String jj, String zname, Integer sl, Integer fid, String fname) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.price = price;
        this.jj = jj;
        this.zname = zname;
        this.sl = sl;
        this.fid = fid;
        this.fname = fname;
    }
}
