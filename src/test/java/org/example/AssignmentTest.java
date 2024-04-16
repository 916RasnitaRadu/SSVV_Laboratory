package org.example;

import domain.Tema;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.TemaXMLRepository;
import service.Service;
import validation.TemaValidator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {

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
    public void testAddAssignment_Success() {
        Tema newTema = new Tema("1", "a", 1, 11);
        this.service.saveTema("1", "a", 1, 1);

        assertEquals(newTema, this.temaXMLRepository.findOne("1"));
    }

    @Test
    public void testAddAssignment_EmptyId() {
        Tema newTema = new Tema("", "b", 1, 1);
        try {
            this.service.saveTema("", "b", 1, 1);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Entitatea nu este valida!");
        }
    }

    @Test
    public void testAddAssignment_NullId() {
        Tema newTema = new Tema(null, "v", 1, 1);
        try {
            this.service.saveTema(null, "v", 1, 1);

        } catch (Exception e) {
            assertEquals(e.getMessage(), "Numar tema invalid!");
        }
    }

    @Test
    public void testAddAssignment_EmptyDescription() {
        Tema newTema = new Tema("2", "", 1, 3);

        try {
            this.service.saveTema("2", "", 1, 3);

        } catch (Exception e) {
            assertEquals(e.getMessage(), "Descriere invalida!");
        }
    }

    @Test
    public void testAddAssignment_DeadlineLessThan1() {
        Tema newTema = new Tema("3", "a", 0, 1);

        try {
            this.service.saveTema("3", "a", 0, 1);

        } catch (Exception e) {
            assertEquals(e.getMessage(), "Deadlineul trebuie sa fie intre 1-14.");
        }
    }


    @Test
    public void testAddAssignment_DeadlineGreaterThan14() {
        Tema newTema = new Tema("4", "a", 15, 1);

        try {
            this.service.saveTema("4", "b", 15, 1);

        } catch (Exception e) {
            assertEquals(e.getMessage(), "Deadlineul trebuie sa fie intre 1-14.");
        }
    }

    @Test
    public void testAddAssignment_ReceiveGreaterThan14() {
        Tema newTema = new Tema("5", "a", 1, 15);

        try {
            this.service.saveTema("5", "a", 1, 15);

        } catch (Exception e) {
            assertEquals(e.getMessage(), "Saptamana primirii trebuie sa fie intre 1-14.");
        }
    }

    @Test
    public void testAddAssignment_ReceiveLessThan1() {
        Tema newTema = new Tema("6", "a", 1, 0);

        try {
            this.service.saveTema("6", "a", 1, 0);

        } catch (Exception e) {
            assertEquals(e.getMessage(), "Saptamana primirii trebuie sa fie intre 1-14.");
        }
    }



}
