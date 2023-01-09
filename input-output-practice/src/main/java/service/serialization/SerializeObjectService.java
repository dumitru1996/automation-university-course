package service.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObjectService extends FileOutputStream {

    final ObjectOutputStream objectOutputStream;

    public SerializeObjectService(File file) throws IOException {
        super(file);
        objectOutputStream = new ObjectOutputStream(this);
    }

    public void serializeObject(Object object) throws IOException {
        objectOutputStream.writeObject(object);
    }

    public void closeStreams() throws IOException {
        this.objectOutputStream.flush();
        this.objectOutputStream.close();
        this.flush();
        this.close();
    }
}
