package service.readers_writers;

import java.io.BufferedWriter;
import java.io.Writer;

public class BufferedWriterService extends BufferedWriter {

    public BufferedWriterService(Writer writer) {
        super(writer);
    }
}
