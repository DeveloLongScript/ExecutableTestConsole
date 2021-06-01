package me.Lucas.ExecutableTest.commands;

public class version {

    public static void main(String[] args) {
        String system = System.getProperty("os.name") + " " + System.getProperty("os.version");
        String java = System.getProperty("java.home") + " " + System.getProperty("java.version");
        String dir = System.getProperty("user.home") + " " + System.getProperty("user.dir");
        String name = System.getProperty("user.name");

        if (args.length == 1) {
            System.out.println("[INFO] Command overview 'version':");
            System.out.println("[INFO] version <setting>");
            System.out.println("[INFO] ");
            System.out.println("[INFO] <setting>:");
            System.out.println("[INFO] Setting type: OPTIONAL");
            System.out.println("[INFO] Can be:");
            System.out.println("[INFO]  system, java, dir, name");
            System.out.println("[INFO] ");
            System.out.println("[INFO] All 'version' <settings>:");
            System.out.println("[INFO] system: " + system);
            System.out.println("[INFO] java: " + java);
            System.out.println("[INFO] dir: " + dir);
            System.out.println("[INFO] name: " + name);
        }
        if(args.length > 2) {
            System.err.println("[ERROR] While running: 'version', ran into to many arguments");
        }
        if(args.length == 2) {
            if(args[1].equals("system")) {
                System.out.println("[INFO] Command overview 'version system':");
                System.out.println("[INFO] system: " + system);
            } else if (args[1].equals("java")) {
                System.out.println("[INFO] Command overview 'version java':");
                System.out.println("[INFO] java: " + java);
            } else if (args[1].equals("dir")) {
                System.out.println("[INFO] Command overview 'version dir':");
                System.out.println("[INFO] dir: " + dir);
            } else if (args[1].equals("name")) {
                System.out.println("[INFO] Command overview 'version name':");
                System.out.println("[INFO] name: " + name);
            }
        }
    }
}
