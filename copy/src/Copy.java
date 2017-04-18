import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    if (args.length == 0) {
      System.out.println("Usage : copy [source] [destination]");
    }
    else if (args.length == 1) {
      System.out.println("No destination provided");
    }
    else if (args.length == 2) {

    }
  }

  public void readFile(String originalPath, String copyPath) {
    Path filePath = Paths.get(originalPath);
    Path outputPath = Paths.get(copyPath);
    List<String> buffer = new ArrayList<>();
    
    try {
      buffer = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      Files.write(outputPath, buffer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
