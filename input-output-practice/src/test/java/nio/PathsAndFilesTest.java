package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static utils.TestData.getPathsAndFilePaths;

public class PathsAndFilesTest {

    public static void main(String[] args) {
        Path pathToFile = Paths.get(getPathsAndFilePaths());
        String data = " Write some data";

        try {
            Files.createFile(pathToFile);
            Files.writeString(pathToFile, data, StandardOpenOption.APPEND);
            Files.readString(pathToFile);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
