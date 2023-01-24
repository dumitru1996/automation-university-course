package input_output_streams;

import service.file.FileService;
import service.input_output_streams.FileInputStreamService;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static utils.TestData.getFolderPath;

public class FileInputStreamServiceTest {

    public static void main(String[] args) {
        FileService fileService = new FileService(getFolderPath());
        File[] files = fileService.listFiles();

        try (FileInputStreamService fileInputStream = new FileInputStreamService(files[0])) {
            byte[] bytes = fileInputStream.readAllBytes();
            String fileContent = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(fileContent);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
