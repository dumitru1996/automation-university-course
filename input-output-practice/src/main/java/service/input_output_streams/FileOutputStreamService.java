package service.input_output_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamService extends FileOutputStream {

    public FileOutputStreamService(File file) throws FileNotFoundException {
        super(file);
    }
}
