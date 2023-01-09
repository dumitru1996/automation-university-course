package serialization;

import model.Street;
import service.file.FileService;
import service.serialization.SerializeObjectService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.TestData.getFilesSerializationPath;

public class MultipleSerializationTest {

    public static void main(String[] args) throws IOException {
        Street streetInCanada = new Street("Toronto", "Yonge Street", 500);
        Street streetInItaly = new Street("Rome", "Via del Corso", 100);
        Street streetInSpain = new Street("Madrid", "Paseo de la Catellana", 1000);
        Street streetInFrance = new Street("Paris", "Champs-Elysees", 700);

        List<Street> streets = new ArrayList<>() {{
            add(streetInCanada);
            add(streetInItaly);
            add(streetInSpain);
            add(streetInFrance);
        }};

        FileService fileService = new FileService(getFilesSerializationPath());
        File absoluteFile = fileService.getAbsoluteFile();
        if (!fileService.exists()) {
            fileService.createNewFile();
        }
        SerializeObjectService serializeObjectService = new SerializeObjectService(absoluteFile);
        serializeObjectService.serializeObject(streets);
        serializeObjectService.closeStreams();
    }
}
