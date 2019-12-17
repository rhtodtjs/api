package com.actibody.api.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name="category_items")
public class CategoryItems {
    @Id
    @Column(name = "idx")
    private String idx;
    @Column(name = "theme_idx")
    private String themeIdx;
    @Column(name = "categories_idx")
    private String categoriesIdx;
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

    public String getThemeIdx() {
        return themeIdx;
    }

    public void setThemeIdx(String themeIdx) {
        this.themeIdx = themeIdx;
    }

    public String getCategoriesIdx() {
        return categoriesIdx;
    }

    public void setCategoriesIdx(String categoriesIdx) {
        this.categoriesIdx = categoriesIdx;
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
        return "CategoryItems{" +
                "idx='" + idx + '\'' +
                ", themeIdx='" + themeIdx + '\'' +
                ", categoriesIdx='" + categoriesIdx + '\'' +
                ", regDate=" + regDate +
                ", udtDate=" + udtDate +
                '}';
    }
}
