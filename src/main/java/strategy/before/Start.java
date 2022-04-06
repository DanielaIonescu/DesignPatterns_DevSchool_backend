package strategy.before;

import java.util.Random;

public class Start {

    public static void main(String[] args) {
        String pathToFile = "something/another/thing/properties.properties";
        ServerManager serverManager = new ServerManager();

        for (int i = 0; i < 10; i++) {
            switch (fileTypeFromKnownContext()) {
                case "XML":
                    serverManager.startServerForXmlFile(pathToFile);
                    break;
                case "JSON":
                    serverManager.startServerForJsonFile(pathToFile);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown file type received.");
            }
        }
    }

    private static String fileTypeFromKnownContext() {
        int random = (new Random()).nextInt(9);
        if (random < 3) {
            return "XML";
        } else if (random < 6) {
            return "JSON";
        } else {
            return "YAML";
        }
    }

}
