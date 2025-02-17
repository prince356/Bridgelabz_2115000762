import java.io.*;

public class FileReadingComparison {

    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        String filePath = "largeFile.txt";  // Use a 500MB file or adjust the path for testing

        try {
            long fileReaderTime = measureTime(() -> {
                try (FileReader fileReader = new FileReader(filePath)) {
                    char[] buffer = new char[8192]; // Buffer size for FileReader
                    while (fileReader.read(buffer) != -1) {
                        // Reading characters
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            long inputStreamReaderTime = measureTime(() -> {
                try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
                    char[] buffer = new char[8192]; // Buffer size for InputStreamReader
                    while (inputStreamReader.read(buffer) != -1) {
                        // Reading characters
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            System.out.printf("File Size: 500MB | FileReader Time: %,d ns | InputStreamReader Time: %,d ns%n", 
                    fileReaderTime, inputStreamReaderTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
