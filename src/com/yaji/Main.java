package com.yaji;
import java.util.Date;

import static com.yaji.GenderType.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World, YAJI iz kulz!");
        Date date = new Date();
        date.setTime(System.currentTimeMillis());

        Rope rope = new Rope(date, date, "evolve", 44.33, NON, 4);
        Harness harness = new Harness(date, date, "Brian", 42.12, MAN);
        Shoe shoe = new Shoe(date, date, "Alti' miura", 41.5, WOMAN);

        System.out.println(rope.toString());
        System.out.println(harness.toString());
        System.out.println(shoe.toString());
    }
}
