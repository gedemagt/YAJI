package com.yaji;

import java.util.Date;

public class Shoe {
    private Date purchaseDate, lastDate;
    private double size;
    private int gender;
    private String brand;


    public Shoe(Date purchaseDate, Date lastDate, String shoeBrand, double shoeSize, int gender) {
        this.purchaseDate = purchaseDate;
        this.lastDate = lastDate;
        this.size = shoeSize;
        this.gender = gender;
        this.brand = shoeBrand;

    }

    public Date getPurchaseDate(){return this.purchaseDate;  }
    public Date getLastDate(){return this.lastDate; }
    public double getSize(){ return this.size;  }
    public int getGender() { return this.gender;    }
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

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setSize(Float size) {
        this.size = size;
    }

}
