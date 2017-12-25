package com.company;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dt = new Date();
        System.out.println("Date in MM/dd/yyyy format: " + df.format(dt));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        System.out.println("France time: " + df2.format(dt));
    }
}
