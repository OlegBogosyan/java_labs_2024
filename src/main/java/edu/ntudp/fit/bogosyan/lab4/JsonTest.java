package edu.ntudp.fit.bogosyan.lab4;

import edu.ntudp.fit.bogosyan.lab3.controllers.UniversityCreator;
import edu.ntudp.fit.bogosyan.lab3.models.University;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JsonTest {
    @Test
    public void testUniversitySerialization() {

        JsonManager jsonManager = new JsonManager();
        University oldUniversity = UniversityCreator.createTypicalUniversity();

        jsonManager.writeToJsonFile("university.json", oldUniversity);
        University newUniversity = (University) jsonManager.readFromJsonFile("university.json");
        String file_1 = String.valueOf(newUniversity);
        String file_2 = String.valueOf(oldUniversity);
        assertEquals(file_1, file_2);

    }
}