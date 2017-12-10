package com.yaji;
import java.util.Date;


public class Item {
    private  String itemType;
    private  Date purchaseDate, lastDate;
    private String brand;
    private  double size;
    private  Integer gender = 9; // 0 for kvinde, 1 for mand

    public Item(Date purchaseDate, Date lastDate, String brand,double size, Integer gender, String itemType){
            this.purchaseDate = purchaseDate;
            this.lastDate = lastDate;
            this.size = size;
            this.brand = brand;
            this.gender = gender;
            this.itemType = itemType;
    }

    public Date getPurchaseDate(){return this.purchaseDate;  }
    public Date getLastDate(){return this.lastDate; }
    public String getBrand() { return this.brand;  }
    public double getSize() { return size;  }
    public Integer getGender() {return gender;}

    public String getItemType() { return itemType;   }

    public void setGender(Integer gender) { this.gender = gender;   }
    public void setBrand(String brand) {
            this.brand = brand;
        }
    public void setLastDate(Date lastDate) { this.lastDate = lastDate; }
    public void setPurchaseDate(Date purchaseDate) {this.purchaseDate = purchaseDate;}
    public void setSize(double size){ this.size = size;}

    public void setItemType(String itemType) { this.itemType = itemType;   }

    public String toString(){
        String outputString = "";
        outputString += "itemType" + ":" + this.itemType + ";";
        outputString += "purchaseDate" + ":" + this.purchaseDate.toString() + ";";
        outputString += "lastDate" + ":" + lastDate.toString() + ";";
        outputString += "brand" + ":" + brand + ";";
        outputString += "size" + ":" + Double.toString(size) + ";";
        outputString += "gender" + ":" + Integer.toString(gender);
        return outputString;
    }

}
