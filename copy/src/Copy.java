import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  static List<String> buffer = new ArrayList<>();
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
      readFile(args[0]);
      writeFile(args[1]);
    }
    //adding default case, that is identical to no arguments provided, as problem asked for handling that case in specific
    else {
      System.out.println("Usage : copy [source] [destination]");
    }
  }

  public static void readFile(String originalPath) {
    Path filePath = Paths.get(originalPath);
    try {
      buffer = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Couldn't open source file!");
      e.printStackTrace();
    }
  }

  public static void writeFile(String copyPath) {
    Path outputPath = Paths.get(copyPath);
    try {
      Files.write(outputPath, buffer);
    } catch (IOException e) {
      System.out.println("Couldn't create a new file!");
      e.printStackTrace();
    }
  }
}
