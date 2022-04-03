package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_class {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = dt.format(dtf1);
        System.out.println(date1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String date2 = dt.format(dtf2);
        System.out.println(date2);
    }
}
