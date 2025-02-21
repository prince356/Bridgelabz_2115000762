import java.io.*;
class ImageToByteArray {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            
            byte[] imageBytes = baos.toByteArray();
            try (FileOutputStream fos = new FileOutputStream("output.jpg")) {
                fos.write(imageBytes);
                System.out.println("Image copied successfully.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}