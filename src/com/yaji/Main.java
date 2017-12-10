package com.yaji;

import javax.sound.midi.SysexMessage;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World, YAJI iz kulz!");
        Date date = new Date();
        date.setTime(System.currentTimeMillis());

        Rope rope = new Rope(date, date, "evolve", 44.33, 9, 4);
        Harness harness = new Harness(date, date, "Brian", 42.12, 1);
        Shoe shoe = new Shoe(date, date, "Alti' miura", 41.5, 1);

        System.out.println(rope.toString());
        System.out.println(harness.toString());
        System.out.println(shoe.toString());
    }
}
