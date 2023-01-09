package service.input.output.streams;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class BufferedInputStreamService extends BufferedInputStream {

    public BufferedInputStreamService(InputStream inputStream) {
        super(inputStream);
    }
}
