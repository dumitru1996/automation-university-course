package serialization;

import model.Street;
import service.file.FileService;
import service.serialization.DeserializeObjectService;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static utils.TestData.getFilesSerializationPath;

public class MultipleDeserializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileService fileService = new FileService(getFilesSerializationPath());
        File absoluteFile = fileService.getAbsoluteFile();
        DeserializeObjectService deserializeObjectService = new DeserializeObjectService(absoluteFile);
        List<Street> streets = deserializeObjectService.deserializeObjects(Street.class);
        System.out.println(streets);
        deserializeObjectService.closeStreams();
    }
}
