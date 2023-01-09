package service.file;

import java.io.File;

public class FileService extends File {

    final File file;

    public FileService(String pathName) {
        super(pathName);
        file = new File(pathName);
    }
}
