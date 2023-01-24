package readers_writers;

import service.file.FileService;
import service.readers_writers.FileReaderService;

import java.io.File;
import java.io.IOException;

import static utils.TestData.getFolderPath;

public class FileReaderTest {

    public static void main(String[] args) {
        FileService fileServiceFolder = new FileService(getFolderPath());
        File[] files = fileServiceFolder.listFiles();

        try {
            FileReaderService fileReaderService = new FileReaderService(files[0]);
            int data = fileReaderService.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fileReaderService.read();
            }
            fileReaderService.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
