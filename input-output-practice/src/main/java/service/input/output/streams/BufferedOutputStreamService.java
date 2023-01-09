package service.input.output.streams;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamService extends BufferedOutputStream {

    public BufferedOutputStreamService(OutputStream outputStream) {
        super(outputStream);
    }
}
