package com.yaji;
import java.util.Date;

public class Item {
    private  String itemType;
    private  Date purchaseDate, lastDate;
    private String brand;
    private  double size;
    private GenderType gender;

    public Item(Date purchaseDate, Date lastDate, String brand,double size, GenderType gender, String itemType){
            this.purchaseDate = purchaseDate;
            this.lastDate = lastDate;
            this.size = size;
            this.brand = brand;
            this.gender = gender;
            this.itemType = itemType;
    }

    public Date getPurchaseDate(){return purchaseDate;  }
    public Date getLastDate(){return lastDate; }
    public String getBrand() { return brand;  }
    public double getSize() { return size;  }
    public GenderType getGender() {return gender;}
    public String getItemType() { return itemType;   }

    public void setGender(GenderType gender) { this.gender = gender;   }
    public void setBrand(String brand) {this.brand = brand;}
    public void setLastDate(Date lastDate) { this.lastDate = lastDate; }
    public void setPurchaseDate(Date purchaseDate) {this.purchaseDate = purchaseDate;}
    public void setSize(double size){ this.size = size;}
    public void setItemType(String itemType) { this.itemType = itemType;   }

    public String toString(){
        String outputString = "";
        outputString += "itemType" + ":" + itemType + ";";
        outputString += "purchaseDate" + ":" + purchaseDate.toString() + ";";
        outputString += "lastDate" + ":" + lastDate.toString() + ";";
        outputString += "brand" + ":" + brand + ";";
        outputString += "size" + ":" + Double.toString(size) + ";";
        outputString += "gender" + ":" + gender.toString();
        return outputString;
    }

}
