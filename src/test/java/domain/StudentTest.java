package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class StudentTest {
    ///region Test suites for executable domain.Student.getID

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getID()

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#getID()}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("getID: -> public ")
    public void testGetID_Return() {
        Student student = new Student(null, null, 0);

        String actual = student.getID();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.setID

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setID(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#setID(String)}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("setID: -> public ")
    public void testSetID_Return() {
        Student student = new Student(null, null, 0);

        student.setID(((String) null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.getNume

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNume()

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#getNume()}
     * @utbot.returnsFrom {@code return nume;}
     */
    @Test
    @DisplayName("getNume: -> return nume")
    public void testGetNume_ReturnNume() {
        Student student = new Student(null, null, 0);

        String actual = student.getNume();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.setNume

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNume(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#setNume(String)}
     */
    @Test
    @DisplayName("setNume: ")
    public void testSetNume() {
        Student student = new Student(null, null, 0);

        student.setNume(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.getGrupa

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGrupa()

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#getGrupa()}
     * @utbot.returnsFrom {@code return grupa;}
     */
    @Test
    @DisplayName("getGrupa: -> return grupa")
    public void testGetGrupa_ReturnGrupa() {
        Student student = new Student(null, null, -255);

        int actual = student.getGrupa();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.setGrupa

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGrupa(int)

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#setGrupa(int)}
     */
    @Test
    @DisplayName("setGrupa: ")
    public void testSetGrupa() {
        Student student = new Student(null, null, -255);

        student.setGrupa(-255);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.toString

    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()

    @Test
    public void testToString1() {
        String string = "";
        Student student = new Student(null, string, 0);

        String actual = student.toString();

        String expected = "Student{idStudent=null, nume='', grupa=0'}";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.equals

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#equals(Object)}
     * @utbot.executesCondition {@code (o): False}
     * @utbot.executesCondition {@code (o == null): False}
     * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("equals: o == null : True -> return false")
    public void testEquals_GetClassNotEqualsOGetClass() {
        Student student = new Student(null, null, 0);
        int[] o = {};

        boolean actual = student.equals(o);

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#equals(Object)}
     * @utbot.executesCondition {@code (o): True}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("equals: o : True -> return true")
    public void testEquals_O() {
        Student student = new Student(null, null, 0);

        boolean actual = student.equals(student);

        assertTrue(actual);
    }

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#equals(Object)}
     * @utbot.executesCondition {@code (o): False}
     * @utbot.executesCondition {@code (o == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("equals: o == null : False -> return false")
    public void testEquals_OEqualsNull() {
        Student student = new Student(null, null, 0);

        boolean actual = student.equals(null);

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Student.hashCode

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()

    /**
     * @utbot.classUnderTest {@link Student}
     * @utbot.methodUnderTest {@link Student#hashCode()}
     * @utbot.invokes {@link java.util.Objects#hash(Object[])}
     * @utbot.returnsFrom {@code return Objects.hash(idStudent);}
     */
    @Test
    @DisplayName("hashCode: ObjectsHash -> return Objects.hash(idStudent)")
    public void testHashCode_ObjectsHash() {
        Student student = new Student(null, null, 0);

        int actual = student.hashCode();

        assertEquals(31, actual);
    }
    ///endregion

    ///endregion
}
