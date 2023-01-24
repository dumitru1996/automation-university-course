package service.readers_writers;

import java.io.BufferedReader;
import java.io.Reader;

public class BufferedReaderService extends BufferedReader {

    public BufferedReaderService(Reader reader) {
        super(reader);
    }
}
