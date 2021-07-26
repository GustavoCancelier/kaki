package br.com.gustavo.kaki;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void mainTest() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        final String[] args = { "2001-05-14" };
        App.main(args);
        assertEquals("Você tem: 20 anos." + System.lineSeparator(), outContent.toString());
    }
}
