package com.actibody.api.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name="categories")
public class Categories {
    @Id
    @Column(name = "idx")
    private String idx;
    @Column(name = "title")
    private String title;
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
        return "Categories{" +
                "idx='" + idx + '\'' +
                ", title='" + title + '\'' +
                ", regDate=" + regDate +
                ", udtDate=" + udtDate +
                '}';
    }
}
