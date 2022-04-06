package strategy.after;

import lombok.AllArgsConstructor;
import lombok.Setter;
import strategy.after.strategies.FileReaderStrategy;

import java.util.Random;

@AllArgsConstructor
@Setter
public class ServerManager {
    private FileReaderStrategy fileReaderStrategy;

    public void startServer(String propertyFile) {
        fileReaderStrategy.readFile(propertyFile);
        //ex: startServer(properties)
        if ((new Random()).nextInt(10) < 5) {
            System.out.println("Server started with success!");
        } else {
            System.out.println("Server failed to start.");
        }
    }


}
