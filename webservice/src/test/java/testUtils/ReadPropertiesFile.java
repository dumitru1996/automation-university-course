package testUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

    public static Properties readPropertiesFile() {
        Properties prop = null;
        try (InputStream input = ReadPropertiesFile.class.getClassLoader().getResourceAsStream("api.properties")) {
            if (input == null) {
                throw new FileNotFoundException();
            }
            prop = new Properties();
            // load a properties file
            prop.load(input);

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}
