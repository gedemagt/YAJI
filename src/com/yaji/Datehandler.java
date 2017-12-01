package com.yaji;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datehandler {
    private DateFormat dateFormat = new SimpleDateFormat("d.M.y");
    private Date date;

    public Datehandler(String string_date) throws ParseException {
        date = dateFormat.parse(string_date);
    }


    public String toString(){return this.date.toString();}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}
}
