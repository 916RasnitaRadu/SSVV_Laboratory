package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;

import java.util.LinkedHashMap;

import validation.TemaValidator;

import static org.utbot.runtime.utils.java.UtUtils.createInstance;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.java.UtUtils.setField;

public final class ServiceTest {
    ///region Test suites for executable service.Service.createStudentFile

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createStudentFile(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#createStudentFile(String, String)}
     * @utbot.throwsException {@link NullPointerException} in: Nota nota = notaXmlRepo.findOne(new Pair(idStudent, idTema));
     */
    @Test
    @DisplayName("createStudentFile: nota = notaXmlRepo.findOne(new Pair(idStudent, idTema)) : True -> ThrowNullPointerException")
    public void testCreateStudentFile_ThrowNullPointerException() {
        Service service = new Service(null, null, null);
        
        /* This test fails because method [service.Service.createStudentFile] produces [java.lang.NullPointerException]
            service.Service.createStudentFile(Service.java:130) */
        service.createStudentFile(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable service.Service.deleteStudent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteStudent(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#deleteStudent(String)}
     * @utbot.invokes {@link StudentXMLRepository#delete(Object)}
     * @utbot.throwsException {@link NullPointerException} in: Student result = studentXmlRepo.delete(id);
     */
    @Test
    @DisplayName("deleteStudent: result = studentXmlRepo.delete(id) : True -> ThrowNullPointerException")
    public void testDeleteStudent_StudentXMLRepositoryDelete() {
        Service service = new Service(null, null, null);
        
        /* This test fails because method [service.Service.deleteStudent] produces [java.lang.NullPointerException]
            service.Service.deleteStudent(Service.java:70) */
        service.deleteStudent(null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteStudent(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#deleteStudent(String)}
     * @utbot.invokes {@link StudentXMLRepository#delete(Object)}
     * @utbot.throwsException {@link IllegalArgumentException} in: Student result = studentXmlRepo.delete(id);
     */
    @Test
    @DisplayName("deleteStudent: result = studentXmlRepo.delete(id) : True -> ThrowIllegalArgumentException")
    public void testDeleteStudent_StudentXMLRepositoryDelete_1() throws Exception {
        StudentXMLRepository studentXMLRepository = ((StudentXMLRepository) createInstance("repository.StudentXMLRepository"));
        Service service = new Service(studentXMLRepository, null, null);

        assertThrows(IllegalArgumentException.class, () -> service.deleteStudent(null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable service.Service.deleteTema

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteTema(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#deleteTema(String)}
     * @utbot.invokes {@link TemaXMLRepository#delete(Object)}
     * @utbot.throwsException {@link NullPointerException} in: Tema result = temaXmlRepo.delete(id);
     */
    @Test
    @DisplayName("deleteTema: result = temaXmlRepo.delete(id) : True -> ThrowNullPointerException")
    public void testDeleteTema_TemaXMLRepositoryDelete() {
        Service service = new Service(null, null, null);
        
        /* This test fails because method [service.Service.deleteTema] produces [java.lang.NullPointerException]
            service.Service.deleteTema(Service.java:79) */
        service.deleteTema(null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteTema(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#deleteTema(String)}
     * @utbot.invokes {@link TemaXMLRepository#delete(Object)}
     * @utbot.throwsException {@link IllegalArgumentException} in: Tema result = temaXmlRepo.delete(id);
     */
    @Test
    @DisplayName("deleteTema: result = temaXmlRepo.delete(id) : True -> ThrowIllegalArgumentException")
    public void testDeleteTema_TemaXMLRepositoryDelete_1() throws Exception {
        TemaXMLRepository temaXMLRepository = ((TemaXMLRepository) createInstance("repository.TemaXMLRepository"));
        Service service = new Service(null, temaXMLRepository, null);

        assertThrows(IllegalArgumentException.class, () -> service.deleteTema(null));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method deleteTema(java.lang.String)

    @Test
    public void testDeleteTema1() throws Exception {
        TemaXMLRepository temaXMLRepository = ((TemaXMLRepository) createInstance("repository.TemaXMLRepository"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        setField(temaXMLRepository, "repository.AbstractCRUDRepository", "entities", linkedHashMap);
        Service service = new Service(null, temaXMLRepository, null);
        String id = "";
        
        /* This test fails because method [service.Service.deleteTema] produces [java.lang.NullPointerException]
            repository.TemaXMLRepository.getElementFromEntity(TemaXMLRepository.java:17)
            repository.TemaXMLRepository.getElementFromEntity(TemaXMLRepository.java:8)
            repository.AbstractXMLRepository.lambda$writeToXmlFile$0(AbstractXMLRepository.java:65)
            java.base/java.util.LinkedHashMap$LinkedValues.forEach(LinkedHashMap.java:647)
            repository.AbstractXMLRepository.writeToXmlFile(AbstractXMLRepository.java:65)
            repository.AbstractXMLRepository.delete(AbstractXMLRepository.java:99)
            service.Service.deleteTema(Service.java:79) */
        service.deleteTema(id);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable service.Service.saveStudent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method saveStudent(java.lang.String, java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#saveStudent(String, String, int)}
     * @utbot.invokes {@link StudentXMLRepository#save(domain.HasID)}
     * @utbot.throwsException {@link NullPointerException} in: Student result = studentXmlRepo.save(student);
     */
    @Test
    @DisplayName("saveStudent: result = studentXmlRepo.save(student) : True -> ThrowNullPointerException")
    public void testSaveStudent_StudentXMLRepositorySave() {
        Service service = new Service(null, null, null);
        
        /* This test fails because method [service.Service.saveStudent] produces [java.lang.NullPointerException]
            service.Service.saveStudent(Service.java:29) */
        service.saveStudent(null, null, -255);
    }

    /**
     * @utbot.classUnderTest {@link Service}
     * @utbot.methodUnderTest {@link Service#saveStudent(String, String, int)}
     * @utbot.invokes {@link StudentXMLRepository#save(domain.HasID)}
     * @utbot.throwsException {@link ClassCastException} in: Student result = studentXmlRepo.save(student);
     */
    @Test
    @DisplayName("saveStudent: result = studentXmlRepo.save(student) : True -> ThrowClassCastException")
    public void testSaveStudent_StudentXMLRepositorySave_1() throws Exception {
        StudentXMLRepository studentXMLRepository = ((StudentXMLRepository) createInstance("repository.StudentXMLRepository"));
        TemaValidator temaValidator = ((TemaValidator) createInstance("validation.TemaValidator"));
        setField(studentXMLRepository, "repository.AbstractCRUDRepository", "validator", temaValidator);
        Service service = new Service(studentXMLRepository, null, null);
        
        /* This test fails because method [service.Service.saveStudent] produces [java.lang.ClassCastException: class domain.Student cannot be cast to class domain.Tema (domain.Student and domain.Tema are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76aa44a3)]
            validation.TemaValidator.validate(TemaValidator.java:4)
            repository.AbstractCRUDRepository.save(AbstractCRUDRepository.java:34)
            repository.AbstractXMLRepository.save(AbstractXMLRepository.java:89)
            service.Service.saveStudent(Service.java:29) */
        service.saveStudent(null, null, -255);
    }
    ///endregion

    ///endregion
}
