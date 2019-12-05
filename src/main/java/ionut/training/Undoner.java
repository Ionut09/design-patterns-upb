package ionut.training;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Undoner {
    private final static String stringPath = "./src/main/java/ionut/training/oop";

    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get(stringPath), 100)
             .map(Path::toFile)
             .filter(File::isFile)
             .filter(f -> f.getName().endsWith(".java"))
             .peek(File::delete)
             .forEach(f -> System.out.println("File " + f + " has been deleted!"));
    }
}
