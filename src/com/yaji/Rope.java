package com.yaji;

import java.util.Date;

import static com.yaji.GenderType.NON;

public class Rope extends Item{
    private int critFalls;


    public Rope(Date purchaseDate, Date lastDate, String brand, double size, GenderType gender, int critFalls){
        super(purchaseDate, lastDate, brand, size, NON, "rope");
        this.critFalls = critFalls;
    }

    public int getCritFalls() { return critFalls;    }
    public void setCritFalls(int critFalls) { this.critFalls = critFalls; }

    @Override
    public String toString() {
        String outputString="";
        outputString += "itemType" + ":" + getItemType() + ";";
        outputString += "purchaseDate" + ":" + getPurchaseDate() + ";";
        outputString += "lastDate" + ":" + getLastDate() + ";";
        outputString += "brand" + ":" + getBrand() + ";";
        outputString += "size" + ":" + getBrand() + ";";
        outputString += "gender" + ":" + getGender().toString() + ";";
        outputString += "critFalls" + ":" + getCritFalls() + ";";


        return outputString;
    }
}
