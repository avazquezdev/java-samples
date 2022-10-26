package dev.avazquez;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws IOException {
        File file_bom = new File("/tmp/file_with_bom.txt");
        assertTrue(file_bom.exists());
        File file_ascii = new File("/tmp/file_without_bom.txt");
        assertTrue(file_ascii.exists());

        assertTrue(checkBom(file_bom));
        assertFalse(checkBom(file_ascii));
    }

    private boolean checkBom(File file) throws IOException {
        boolean isBom = false;
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        char bomChar = (char) isr.read();
        if (bomChar == 0xFEFF) {
            isBom = true;
        }

        isr.close();
        return isBom;
    }
}