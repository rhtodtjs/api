package com.actibody.api.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name="test_table")
public class TestTable {
    private long idx;
    private String text;
    private Timestamp regDate;
    private Timestamp udtDate;

    @Id
    @Column(name = "idx")
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "reg_date")
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "udt_date")
    public Timestamp getUdtDate() {
        return udtDate;
    }

    public void setUdtDate(Timestamp udtDate) {
        this.udtDate = udtDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestTable testTable = (TestTable) o;
        return idx == testTable.idx &&
                Objects.equals(text, testTable.text) &&
                Objects.equals(regDate, testTable.regDate) &&
                Objects.equals(udtDate, testTable.udtDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, text, regDate, udtDate);
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
