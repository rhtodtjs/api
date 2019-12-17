package com.actibody.api.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name="themes")
public class Themes {
    @Id
    @Column(name = "idx")
    private String idx;
    @Column(name = "title")
    private String title;
    @Column(name = "desc")
    private String desc;
    @Column(name = "order")
    private Long order;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "reg_date",updatable = false,insertable = false)
    private Timestamp regDate;
    @Column(name = "udt_date",updatable = false,insertable = false)
    private Timestamp udtDate;

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    public Timestamp getUdtDate() {
        return udtDate;
    }

    public void setUdtDate(Timestamp udtDate) {
        this.udtDate = udtDate;
    }

    @Override
    public String toString() {
        return "Themes{" +
                "idx='" + idx + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", order=" + order +
                ", imgUrl='" + imgUrl + '\'' +
                ", regDate=" + regDate +
                ", udtDate=" + udtDate +
                '}';
    }
}
