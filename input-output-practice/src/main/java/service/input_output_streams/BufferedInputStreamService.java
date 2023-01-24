package service.input_output_streams;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class BufferedInputStreamService extends BufferedInputStream {

    public BufferedInputStreamService(InputStream inputStream) {
        super(inputStream);
    }
}
