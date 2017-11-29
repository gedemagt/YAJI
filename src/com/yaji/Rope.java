package com.yaji;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Rope {
    private Date purchaseDate, lastDate;
    private Integer length, critFalls;
    private String brand;
    private DateFormat dateFormat = new SimpleDateFormat("d.M.y");

    public Rope(String purchase_date, String last_date, Integer rope_length, String rope_brand, Integer crit_falls) throws ParseException {

        purchaseDate = dateFormat.parse(purchase_date);
        lastDate = dateFormat.parse(last_date);
        length = rope_length;
        brand = rope_brand;
        critFalls = crit_falls;
    }

    public Date getPurchaseDate(){return this.purchaseDate;  }
    public Date getLastDate(){return this.lastDate; }
    public Integer getLength(){ return this.length;  }
    public Integer getCritFalls() { return this.critFalls;    }
    public String getBrand() { return this.brand;  }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCritFalls(Integer critFalls) {
        this.critFalls = critFalls;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
