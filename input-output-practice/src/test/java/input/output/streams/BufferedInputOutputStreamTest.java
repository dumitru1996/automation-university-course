package input.output.streams;

import service.file.FileService;
import service.input.output.streams.BufferedInputStreamService;
import service.input.output.streams.BufferedOutputStreamService;
import service.input.output.streams.FileInputStreamService;
import service.input.output.streams.FileOutputStreamService;

import java.io.IOException;

import static utils.TestData.getInputFilePath;
import static utils.TestData.getOutputFilePath;


public class BufferedInputOutputStreamTest {

    public static void main(String[] args) throws IOException {
        FileService inputFile = new FileService(getInputFilePath());
        FileService outputFile = new FileService(getOutputFilePath());

        FileInputStreamService fileInputStream = new FileInputStreamService(inputFile);
        FileOutputStreamService fileOutputStream = new FileOutputStreamService(outputFile);

        BufferedInputStreamService bufferedInputStreamService = new BufferedInputStreamService(fileInputStream);
        BufferedOutputStreamService bufferedOutputStreamService = new BufferedOutputStreamService(fileOutputStream);

        if (inputFile.exists()) {
            byte[] byteArray = bufferedInputStreamService.readAllBytes();
            bufferedOutputStreamService.write(byteArray);
        }

//*  Another way to read and write from a file to another file simultaneously
//        int temp;
//        if (inputFile.exists()) {
//            while ((temp = bufferedInputStreamService.read()) != -1) {
//                bufferedOutputStreamService.write(temp);
//            }
//        }

        bufferedInputStreamService.close();
        bufferedOutputStreamService.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
