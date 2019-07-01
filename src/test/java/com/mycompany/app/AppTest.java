package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    private List<String> readList(String fileName) {
        List<String> expected = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                expected.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expected;
    }
    @Test
    public void writeToFileTest() {
        List<String> expected = new ArrayList<>();
        expected.add("string1");
        expected.add("string2");
        expected.add("string3");
        App app = new App();
        app.writeToFile(expected, "target/output.txt");

        List<String> test = readList("target/output.txt");

        assertEquals(expected, test);
    }


}


