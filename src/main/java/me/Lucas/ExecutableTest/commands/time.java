package me.Lucas.ExecutableTest.commands;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    public static String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return date.toString();
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("[ERROR] While running: 'time', ran into to many arguments (needed no arguments at all)");
        }
        if (args.length == 1) {
            System.out.println("[INFO] The current time is " + getTime());
        }
    }
}
