package dev.avazquez;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Path file_with_bom = Paths.get("/tmp/file_with_bom.txt");
        Path file_without_bom = Paths.get("/tmp/file_without_bom.txt");

        String text = "Hello world";

        writeFile(file_with_bom, text,true);
        writeFile(file_without_bom, text,false);
    }

    private static void writeFile(Path path, String content, boolean bom) {
        // Java 8 default UTF-8
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            if (bom)
                bw.write("\ufeff");
            bw.write(content);
            bw.newLine();
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}