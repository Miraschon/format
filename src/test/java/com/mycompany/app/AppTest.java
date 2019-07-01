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

    @Test
    public void writeToFileTest() {
        List<String> expected = new ArrayList<>();
        expected.add("string1");
        expected.add("string2");
        expected.add("string3");
        App app = new App();
        app.writeToFile(expected, "target/output.txt");

        List<String> test;
        test = App.readToList("target/output.txt");

        assertEquals(expected, test);
    }


}


