package service.readers.writers;

import java.io.BufferedWriter;
import java.io.Writer;

public class BufferedWriterService extends BufferedWriter {

    public BufferedWriterService(Writer writer) {
        super(writer);
    }
}
