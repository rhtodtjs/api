package com.actibody.api.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name = "test_table")
public class TestTable {

    @Id
    @Column(name = "idx")
    private long idx;
    private String text;
    @Column(name = "reg_date", insertable = false, updatable = false)
    private Timestamp regDate;
    @Column(name = "udt_date", insertable = false, updatable = false)
    private Timestamp udtDate;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        return "TestTable{" +
                "idx=" + idx +
                ", text='" + text + '\'' +
                ", regDate=" + regDate +
                ", udtDate=" + udtDate +
                '}';
    }
}
