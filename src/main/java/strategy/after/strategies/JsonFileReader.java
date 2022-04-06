package strategy.after.strategies;

public class JsonFileReader implements FileReaderStrategy {
    @Override
    public void readFile(String filePath) {
        System.out.println("Json file read from: " + filePath);
    }
}
