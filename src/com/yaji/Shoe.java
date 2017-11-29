package com.yaji;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Shoe {
    private Date purchaseDate, lastDate;
    private double size;
    private Integer gender;
    private String brand;
    private DateFormat dateFormat = new SimpleDateFormat("d.M.y");

    public Shoe(String purchase_date, String last_date, String shoe_brand, double shoe_size, Integer Gender) throws ParseException {
        purchaseDate = dateFormat.parse(purchase_date);
        lastDate = dateFormat.parse(last_date);
        size = shoe_size;
        gender = Gender;
        brand = shoe_brand;

    }

    public Date getPurchaseDate(){return this.purchaseDate;  }
    public Date getLastDate(){return this.lastDate; }
    public double getSize(){ return this.size;  }
    public Integer getGender() { return this.gender;    }
    public String getBrand() { return this.brand;  }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setSize(Float size) {
        this.size = size;
    }

}
