package service.readers_writers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderService extends FileReader {

    public FileReaderService(File file) throws FileNotFoundException {
        super(file);
    }
}
