package input_output_streams;

import service.file.FileService;
import service.input_output_streams.FileOutputStreamService;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static utils.TestData.getFolderPath;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService(getFolderPath());
        File[] files = fileService.listFiles();
        FileOutputStreamService fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStreamService(files[1]);
            String stringToWrite = "Write some data here";
            fileOutputStream.write(stringToWrite.getBytes(StandardCharsets.UTF_8));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }
}
