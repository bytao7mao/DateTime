package com.company;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        DateFormat df2;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dt = new Date();
        System.out.println("Date in MM/dd/yyyy format: " + df.format(dt));

        if(country.equalsIgnoreCase("france")){
            df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        }
        else if(country.equalsIgnoreCase("england")){
            df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        }
        else if(country.equalsIgnoreCase("china")){
            df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        }
        else {
            df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        }
        System.out.println("Your country " + country + " time is : " + df2.format(dt));
    }
}
