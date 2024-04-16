package org.example;

import domain.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import repository.NotaXMLRepository;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.ValidationException;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    public static Service service;

    @BeforeAll
    public static void setup() {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        NotaValidator notaValidator = new NotaValidator();

        String fileStudent = "studenti.xml";
        String fileTema = "teme.xml";
        String fileNota = "note.xml";

        StudentXMLRepository studentXMLRepository = new StudentXMLRepository(studentValidator, fileStudent);
        TemaXMLRepository temaXMLRepository = new TemaXMLRepository(temaValidator,fileTema);
        NotaXMLRepository notaXMLRepository = new NotaXMLRepository(notaValidator, fileNota);
        StudentTest.service = new Service(studentXMLRepository,temaXMLRepository, notaXMLRepository);


    }

    @Test
    public void testSaveStudent_ValidData_CreatedSuccessfully() {
        String id = "test";
        String nume = "john";
        int grupa = 936;

        try {
            int result = service.saveStudent(id, nume, grupa);
            assertEquals(0, result);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }


    }

    @org.junit.jupiter.api.Test
    public void saveStudent_InvalidGroup_ThrowError() {
        String id = "Test";
        String nume = "Eu";
        int grupa = 99;
        try {
            int result = service.saveStudent(id, nume, grupa);
            assertEquals(result, 1);
        }
        catch (ValidationException exception)
        {
            System.out.println(exception.getMessage());
            assertFalse(true);
        }
    }

    @Test
    public void saveStudent_EmptyName_ThrowError() {
        String id = "test";
        String nume = "";
        int grup = 931;

        try {
            int result = service.saveStudent(id, nume, grup);
            assertEquals(result, 1);
        }
        catch (ValidationException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void saveStudent_NullId_ThrowError() {
        String idStud = null;
        String numeStudent = "John";
        int grupa = 936;

        try {
            int result = service.saveStudent(idStud, numeStudent, grupa);
            assert(result == 1);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void saveStudent_BoundaryValuesGroup_CreateSuccess() {
        String id1 = "Student1";
        String nume1 = "Nume1";
        int grupa1 = 111;

        String id2 = "Student2";
        String nume2 = "Nume2";
        int grupa2 = 937;

        try {
            int result = service.saveStudent(id1, nume1, grupa1);
            assertEquals(result, 0);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = service.saveStudent(id2, nume2, grupa2);
            assertEquals(result, 0);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void saveStudent_BoundaryValuesGroup_ThrowError() {
        String id1 = "Student1";
        String nume1 = "Nume1";
        int grupa1 = 110;

        String id2 = "Student2";
        String nume2 = "Nume2";
        int grupa2 = 938;

        try {
            int result = service.saveStudent(id1, nume1, grupa1);
            assertEquals(result, 1);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = service.saveStudent(id2, nume2, grupa2);
            assertEquals(result, 1);
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        }
    }
}