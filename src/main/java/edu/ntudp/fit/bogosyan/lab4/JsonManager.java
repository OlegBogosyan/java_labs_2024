package edu.ntudp.fit.bogosyan.lab4;

import com.google.gson.Gson;

import edu.ntudp.fit.bogosyan.lab3.controllers.UniversityCreator;
import edu.ntudp.fit.bogosyan.lab3.models.University;
import org.junit.Test;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import static org.junit.Assert.assertEquals;

public class JsonManager {
    private final Gson gson;

    public JsonManager() {
        this.gson = new Gson();
    }

    public void writeToJsonFile(String fileName, University university) {
        String json = gson.toJson(university);

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public University readFromJsonFile(String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}