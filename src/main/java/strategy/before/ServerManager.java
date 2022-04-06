package strategy.before;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class ServerManager {

    public void startServerForXmlFile(String propertyFile) {
        System.out.println("Server started with properties from XML file.");
    }

    public void startServerForJsonFile(String propertyFile) {
        System.out.println("Server started with properties from Json file.");
    }

//    public void startServerForYamlFile(String propertyFile) {
//        System.out.println("Server started with properties from Yaml file.");
//    }


}
