package com.yaji;

import java.util.Date;

public class Shoe extends Item{
    public Shoe(Date purchaseDate, Date lastDate, String brand, double shoeSize, GenderType gender) {
        super(purchaseDate, lastDate, brand, shoeSize, gender, "shoe");
    }
}
