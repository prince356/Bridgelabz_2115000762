import java.io.*;
class LargeFileReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("largefile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}