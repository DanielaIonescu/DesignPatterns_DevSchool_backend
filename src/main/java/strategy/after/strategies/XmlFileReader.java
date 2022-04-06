package strategy.after.strategies;

public class XmlFileReader implements FileReaderStrategy {
    @Override
    public void readFile(String filePath) {
        System.out.println("Xml file read from: " + filePath);
    }
}
