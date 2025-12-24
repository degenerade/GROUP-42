package se.max.menu;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Avatar {

    public static void print() {
        try {
            URL resourceUrl = Avatar.class.getResource("/se/max/menu/friendlySpider.txt");
            if (resourceUrl == null) {
                throw new NullPointerException("File not found in resources...");
            }
            Path path = Path.of(resourceUrl.toURI());
            String asciiArt = Files.readString(path);
            System.out.println(asciiArt);
        } catch (IOException e) {
            System.err.println("Error reading the file " + e.getMessage());
        } catch (URISyntaxException e) {
            System.err.println("URISyntaxException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }
    }
}
