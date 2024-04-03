package org.example;

import domain.Tema;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.TemaXMLRepository;
import service.Service;
import validation.TemaValidator;
import validation.ValidationException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddAssignment {

    private TemaXMLRepository temaXMLRepository;
    private TemaValidator temaValidator;
    private Service service;

    @BeforeAll
    public static void createXML() {
        File xml = new File("temeTest.xml");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(xml))) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                    "<inbox>\n" +
                    "\n" +
                    "</inbox>");
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    public void setup() {
        this.temaValidator = new TemaValidator();
        this.temaXMLRepository = new TemaXMLRepository(temaValidator,"temeTest.xml");
        this.service = new Service(null, temaXMLRepository, null);
    }

    @AfterAll
    static void removeXML() {
        new File("temeTest.xml").delete();
    }

    @Test
    public void testAddAssignmentValidAssignment() {
        Tema tema = new Tema("1", "a", 3, 1);
        this.service.saveTema("1", "a", 3, 1);
        assertTrue(this.service.findAllTeme().iterator().hasNext());
        assertEquals(this.service.findAllTeme().iterator().next(), tema);
    }

    @Test
    void testAddAssignmentEmptyID() {
        Tema newTema = new Tema("", "a", 1, 1);
        int result = this.service.saveTema("", "a", 2, 1);
        assertEquals(result, 1);
        assertFalse(this.service.findAllTeme().iterator().hasNext());
    }


}
