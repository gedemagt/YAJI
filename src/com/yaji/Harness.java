package com.yaji;

import java.util.Date;

public class Harness {
        private Date purchaseDate, lastDate;
        private double  size;
        private int gender;
        private String brand;


        public Harness(Date purchase_date, Date last_date, String harness_brand, double harness_size, int Gender){
            purchaseDate = purchase_date;
            lastDate = last_date;
            size = harness_size;
            gender = Gender;
            brand = harness_brand;
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

        public void setSize(double size) {
            this.size = size;
        }

    }
