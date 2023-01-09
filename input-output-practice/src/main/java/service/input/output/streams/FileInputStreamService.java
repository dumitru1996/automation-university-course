package service.input.output.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamService extends FileInputStream {

    public FileInputStreamService(File file) throws FileNotFoundException {
        super(file);
    }
}
