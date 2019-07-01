package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger log = LogManager.getLogger(App.class);
    public static void readToList(String fileName) {
        {
            List<String> strings = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    strings.add(sCurrentLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    void writeToFile(List<String> strings,String fileName){
        log.debug("start");
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (String str : strings) {
                writer.println(str);
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        log.debug("finish");

    }
}