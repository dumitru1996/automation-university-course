package serialization;

import model.Street;
import service.file.FileService;
import service.serialization.SerializeObjectService;

import java.io.File;
import java.io.IOException;

import static utils.TestData.getFileSerializationPath;

public class SerializationTest {

    public static void main(String[] args) throws IOException {
        String city = "New York";
        String streetName = "Park Avenue";
        int numberOfBuildings = 200;
        Street street = new Street(city, streetName, numberOfBuildings);
        FileService fileService = new FileService(getFileSerializationPath());
        File absoluteFile = fileService.getAbsoluteFile();
        if (!fileService.exists()) {
            fileService.createNewFile();
        }
        SerializeObjectService serializeObjectService = new SerializeObjectService(absoluteFile);
        serializeObjectService.serializeObject(street);
        serializeObjectService.closeStreams();
    }
}
