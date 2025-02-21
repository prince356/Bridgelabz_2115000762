import java.io.*;
class BufferedFileCopy {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy_largefile.txt"))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();
            System.out.println("Buffered copy time: " + (endTime - startTime) + " nanoseconds");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}