package com.chy.po;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;

public class DataType {
    private Integer id;
   private byte d_byte;
   private short d_short;
   private int d_int;
   private long d_long;
   private float d_float;
   private double d_double;
   private java.sql.Date d_sDate;
   private java.util.Date d_jDate;
   private Blob d_blob;
   private Clob d_clob;
   private char d_char;
   private String d_String;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte getD_byte() {
        return d_byte;
    }

    public void setD_byte(byte d_byte) {
        this.d_byte = d_byte;
    }

    public short getD_short() {
        return d_short;
    }

    public void setD_short(short d_short) {
        this.d_short = d_short;
    }

    public int getD_int() {
        return d_int;
    }

    public void setD_int(int d_int) {
        this.d_int = d_int;
    }

    public long getD_long() {
        return d_long;
    }

    public void setD_long(long d_long) {
        this.d_long = d_long;
    }

    public float getD_float() {
        return d_float;
    }

    public void setD_float(float d_float) {
        this.d_float = d_float;
    }

    public double getD_double() {
        return d_double;
    }

    public void setD_double(double d_double) {
        this.d_double = d_double;
    }

    public Date getD_sDate() {
        return d_sDate;
    }

    public void setD_sDate(Date d_sDate) {
        this.d_sDate = d_sDate;
    }

    public java.util.Date getD_jDate() {
        return d_jDate;
    }

    public void setD_jDate(java.util.Date d_jDate) {
        this.d_jDate = d_jDate;
    }

    public Blob getD_blob() {
        return d_blob;
    }

    public void setD_blob(Blob d_blob) {
        this.d_blob = d_blob;
    }

    public Clob getD_clob() {
        return d_clob;
    }

    public void setD_clob(Clob d_clob) {
        this.d_clob = d_clob;
    }

    public char getD_char() {
        return d_char;
    }

    public void setD_char(char d_char) {
        this.d_char = d_char;
    }

    public String getD_String() {
        return d_String;
    }

    public void setD_String(String d_String) {
        this.d_String = d_String;
    }
}
