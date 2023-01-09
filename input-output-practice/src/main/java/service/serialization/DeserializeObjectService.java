package service.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.stream.Collectors;

public class DeserializeObjectService extends FileInputStream {

    final ObjectInputStream objectInputStream;

    public DeserializeObjectService(File file) throws IOException {
        super(file);
        objectInputStream = new ObjectInputStream(this);
    }

    public <T> T deserializeObject(Class<T> clazz) throws IOException, ClassNotFoundException {
        return clazz.cast(objectInputStream.readObject());
    }

    public <T> List<T> deserializeObjects(Class<T> clazz) throws IOException, ClassNotFoundException {
        return (List<T>) ((List) objectInputStream.readObject()).stream()
                .map(clazz::cast)
                .collect(Collectors.toList());
    }

    public void closeStreams() throws IOException {
        this.close();
        this.objectInputStream.close();
    }
}
