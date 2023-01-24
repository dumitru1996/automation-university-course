package service.input_output_streams;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamService extends BufferedOutputStream {

    public BufferedOutputStreamService(OutputStream outputStream) {
        super(outputStream);
    }
}
