package readers.writers;

import service.readers.writers.BufferedReaderService;
import service.readers.writers.BufferedWriterService;
import service.readers.writers.FileReaderService;
import service.readers.writers.FileWriterService;

import java.io.File;
import java.io.IOException;

import static utils.TestData.getReadFilePath;
import static utils.TestData.getWriteFilePath;

public class BufferedReaderWriterTest {

    public static void main(String[] args) throws IOException {
        BufferedReaderService bufferedReaderService = new BufferedReaderService(new FileReaderService(new File(getReadFilePath())));
        BufferedWriterService bufferedWriterService = new BufferedWriterService(new FileWriterService(new File(getWriteFilePath())));

        int temp;
        do {
            temp = bufferedReaderService.read();
            if (temp != -1) {
                if (Character.isLowerCase((char) temp))
                    bufferedWriterService.write(Character.toUpperCase((char) temp));
                else if (Character.isUpperCase((char) temp))
                    bufferedWriterService.write(Character.toLowerCase((char) temp));
                else
                    bufferedWriterService.write((char) temp);
            }
        } while (temp != -1);


        String[] names = {"Martha", "Jack", "Jill"};
        bufferedWriterService.write("\nWrite names to file:");
        for (String name : names) {
            bufferedWriterService.write("\n" + name);
        }

        String line;
        while ((line = bufferedReaderService.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReaderService.close();
        bufferedWriterService.close();
    }
}
