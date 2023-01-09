package readers.writers;

import service.file.FileService;
import service.readers.writers.FileWriterService;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static utils.TestData.getFilePath;

public class FileWriterTest {

    public static void main(String[] args) {
        FileService file = new FileService(getFilePath());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriterService fileWriterService = new FileWriterService(new File(getFilePath()), true)) {
            String provideData = "Write some data";
            fileWriterService.write(provideData);
            fileWriterService.append(System.lineSeparator());
            fileWriterService.write(LocalDateTime.now().toString());
            fileWriterService.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
