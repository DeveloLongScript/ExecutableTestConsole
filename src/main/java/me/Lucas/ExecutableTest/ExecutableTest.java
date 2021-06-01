package me.Lucas.ExecutableTest;

import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;
import me.Lucas.ExecutableTest.commands.quit;

import java.io.File;
import java.util.Scanner;

import static com.diogonunes.jcolor.Ansi.colorize;

@apiCommand
public class ExecutableTest {
    public static String name = "ExecutableTest";
    public static Double version = 1.0;
    public static String version_type = "-RELEASE";

    public static AnsiFormat start = new AnsiFormat(Attribute.BRIGHT_BLUE_TEXT());

    public static String reset = "\\u001b[0m";

    public static File config;

    public static void createFile() {
        config = new File("C:/ET/config.yml");
        if (config.exists()) {
            return;
        }
        if (!(config.exists())) {
            new File("C:/ET/").mkdir();
            try {
                config.createNewFile();
            } catch(Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws Exception {

        createFile();

        System.out.println(colorize("Running " + name + ":" + version + version_type, start));
        /**
         *
         * Big thanks to Dreamspace President ( https://stackoverflow.com/users/3500521/dreamspace-president )
         * making it so when you double click the software, it actually works.
         *
         */
        me.Lucas.ExecutableTest.AutoRunFromConsole.runYourselfInConsole(false);
        if (System.console() == null) {
            System.out.println("");
            System.out.println("[INFO] Currently using the console application");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("[INFO] Currenctly using double click software");
            System.out.println("[INFO] Big thanks to Dreamspace President (https://stackoverflow.com/users/3500521/dreamspace-president)");
            System.out.println("");
        }
        while(quit.quited == false) {
            Scanner myObj;
            myObj = new Scanner(System.in);

            System.out.print("ExecuteableTest " + version + " > ");
            String maincommand;

            maincommand = myObj.nextLine();

            check(maincommand);
        }
    }
    public static void check(String maincommand) {

        if(maincommand.startsWith("ver")) {
            String[] argtest = maincommand.split(" ");
            me.Lucas.ExecutableTest.commands.version.main(argtest);
        } else if (maincommand.startsWith("version")) {
            String[] argtest = maincommand.split(" ");
            me.Lucas.ExecutableTest.commands.version.main(argtest);
        } else if (maincommand.startsWith("time")) {
            String[] argtest = maincommand.split(" ");
            me.Lucas.ExecutableTest.commands.time.main(argtest);
        } else if (maincommand.startsWith("open")) {
            String[] argtest = maincommand.split(" ");
            me.Lucas.ExecutableTest.commands.open.main(argtest);
        } else if (maincommand.startsWith("quit")) {
            String[] argtest = maincommand.split(" ");
            me.Lucas.ExecutableTest.commands.quit.main(argtest);
        } else if (maincommand.isEmpty()) {

        } else if (maincommand.contains(" ")) {

        }
        else {
            System.err.println("[ERROR] There was no command named '" + maincommand.split(" ")[0] + "'");
        }
    }
}
