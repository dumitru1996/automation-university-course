package serialization;

import model.Street;
import service.file.FileService;
import service.serialization.DeserializeObjectService;

import java.io.File;
import java.io.IOException;

import static utils.TestData.getFileSerializationPath;

public class DeserializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileService fileService = new FileService(getFileSerializationPath());
        File absoluteFile = fileService.getAbsoluteFile();
        DeserializeObjectService deserializeObjectService = new DeserializeObjectService(absoluteFile);
        Street street = deserializeObjectService.deserializeObject(Street.class);
        System.out.println(street);
        deserializeObjectService.closeStreams();
    }
}
