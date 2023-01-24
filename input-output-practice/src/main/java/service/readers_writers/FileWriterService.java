package service.readers_writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService extends FileWriter {

    public FileWriterService(File file, boolean append) throws IOException {
        super(file, append);
    }

    public FileWriterService(File file) throws IOException {
        super(file);
    }
}
