package strategy.after.strategies;

public class YamlFileReader implements FileReaderStrategy {
    @Override
    public void readFile(String filePath) {
        System.out.println("Yaml file read from: " + filePath);
    }
}
