package strategy.after;

import strategy.after.strategies.FileReaderStrategy;
import strategy.after.strategies.JsonFileReader;
import strategy.after.strategies.XmlFileReader;
import strategy.after.strategies.YamlFileReader;

import java.util.Random;

public class Start {

    public static void main(String[] args) {
        String pathToFile = "something/another/thing/properties.properties";
        FileReaderStrategy fileReader = fileReaderFromKnownContext();
        ServerManager serverManager = new ServerManager(fileReader);
        serverManager.startServer(pathToFile);

        for (int i = 0; i < 3; i++) {
            serverManager.setFileReaderStrategy(fileReaderFromKnownContext());
            serverManager.startServer(pathToFile);
        }
    }

    private static FileReaderStrategy fileReaderFromKnownContext() {
        int random = (new Random()).nextInt(9);
        if (random < 3) {
            return new XmlFileReader();
        } else if (random < 6) {
            return new JsonFileReader();
        } else {
            return new YamlFileReader();
        }
    }
}
