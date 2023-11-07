package com.example.section6test1;


import android.annotation.SuppressLint;
import android.database.Cursor;

public final class FunkoPOP {
    private int pop_Number;
    private String pop_Name;
    private String pop_Type;
    private String fandom;
    private Boolean on;
    private String ultimate;
    private double price;
    Cursor mCursor;
    public FunkoPOP(String popName, int popNumber, String popType, String fandom, boolean on, String ultimate, double price) {
        this.pop_Name = popName;
        this.pop_Number = popNumber;
        this.pop_Type = popType;
        this.fandom = fandom;
        this.on = on;
        this.ultimate = ultimate;
        this.price = price;
    }
    @SuppressLint("Range")
    int popNumber = mCursor.getInt(mCursor.getColumnIndex(NamesProvider.COLUMN_POP_NUMBER));
    public int getPopNumber() {
        return pop_Number;
    }

    public String getPopName() {
        return pop_Name;
    }

    public String getPopType() {
        return pop_Type;
    }

    public String getFandom() {
        return fandom;
    }

    public Boolean getOn() {
        return on;
    }

    public String getUltimate() {
        return ultimate;
    }

    public double getPrice() {
        return price;
    }

    public void setPopName(String popName){
        this.pop_Name = popName;
    }
    public void setPopNumber(int popNumber){
        this.pop_Number=popNumber;
    }

    public void setPopType(String popType){
        this.pop_Type=popType;
    }

    public void setFandom(String fandom){
        this.fandom=fandom;
    }

    public void setOn(Boolean on){
        this.on = on;
    }

    public void setUltimate(String ultimate){
        this.ultimate=ultimate;
    }

    public void setPrice(double price){
        this.price=price;
    }

    @Override
    public String toString() {
        return "FunkoPOP{" +
                "popName='" + pop_Name + '\'' +
                ", popNumber=" + pop_Number +
                ", popType='" + pop_Type + '\'' +
                ", fandom='" + fandom + '\'' +
                ", on=" + on +
                ", ultimate='" + ultimate + '\'' +
                ", price=" + price +
                '}';
    }


}