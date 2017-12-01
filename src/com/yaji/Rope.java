package com.yaji;

import java.util.Date;


public class Rope {
    private Date purchaseDate, lastDate;
    private int length, critFalls;
    private String brand;


    public Rope(Date purchase_date, Date last_date, int rope_length, String rope_brand, int crit_falls){

        purchaseDate = purchase_date;
        lastDate = last_date;
        length = rope_length;
        brand = rope_brand;
        critFalls = crit_falls;
    }

    public Date getPurchaseDate(){return this.purchaseDate;  }
    public Date getLastDate(){return this.lastDate; }
    public int getLength(){ return this.length;  }
    public int getCritFalls() { return this.critFalls;    }
    public String getBrand() { return this.brand;  }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCritFalls(int critFalls) {
        this.critFalls = critFalls;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
