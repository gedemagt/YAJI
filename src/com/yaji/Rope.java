package com.yaji;

import java.util.Date;

public class Rope extends Item{
    private int critFalls;
    private String outputString="";

    public Rope(Date purchaseDate, Date lastDate, String brand,double size, int gender, int critFalls){
        super(purchaseDate, lastDate, brand, size, 9, "rope");
        this.critFalls = critFalls;
    }

    public int getCritFalls() { return this.critFalls;    }
    public void setCritFalls(int critFalls) { this.critFalls = critFalls; }

    @Override
    public String toString() {
        this.outputString += "itemType" + ":" + this.getItemType() + ";";
        this.outputString += "purchaseDate" + ":" + this.getPurchaseDate() + ";";
        this.outputString += "lastDate" + ":" + this.getLastDate() + ";";
        this.outputString += "brand" + ":" + this.getBrand() + ";";
        this.outputString += "size" + ":" + this.getBrand() + ";";
        this.outputString += "critFalls" + ":" + this.getCritFalls() + ";";

        return outputString;
    }
}
