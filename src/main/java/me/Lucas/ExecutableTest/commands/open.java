package me.Lucas.ExecutableTest.commands;

import java.awt.*;
import java.io.File;

public class open {
    public static void main(String[] args) {
        if (!(args.length == 1) && args.length == 2) {
            File file = new File(args[1]);
            if (file.exists() == false) {
                System.err.println("[ERROR] The following file does not exist");
            } else {
                try {
                    if(!Desktop.isDesktopSupported()) {
                        System.err.println("[ERROR] The following desktop is not supported.");
                        return;
                    }
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(file);
                    System.out.println("[INFO] Opened file");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.err.println("[ERROR] While running: 'open', ran into to little or more arguments");
        }
    }
}
