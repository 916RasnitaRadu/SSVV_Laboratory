package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class TemaTest {
    ///region Test suites for executable domain.Tema.getID

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getID()

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#getID()}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("getID: -> public ")
    public void testGetID_Return() {
        Tema tema = new Tema(null, null, 0, 0);

        String actual = tema.getID();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.setID

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setID(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#setID(String)}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("setID: -> public ")
    public void testSetID_Return() {
        Tema tema = new Tema(null, null, 0, 0);

        tema.setID(((String) null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.getDescriere

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDescriere()

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#getDescriere()}
     * @utbot.returnsFrom {@code return descriere;}
     */
    @Test
    @DisplayName("getDescriere: -> return descriere")
    public void testGetDescriere_ReturnDescriere() {
        Tema tema = new Tema(null, null, 0, 0);

        String actual = tema.getDescriere();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.setDescriere

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDescriere(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#setDescriere(String)}
     * @utbot.returnsFrom {@code public void setDescriere(String descriere) {
     * this.descriere = descriere;
     * }}
     */
    @Test
    @DisplayName("setDescriere: -> public void setDescriere(String descriere) { this.descriere = descriere }")
    public void testSetDescriere_Return() {
        Tema tema = new Tema(null, null, 0, 0);

        tema.setDescriere(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.getDeadline

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeadline()

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#getDeadline()}
     * @utbot.returnsFrom {@code return deadline;}
     */
    @Test
    @DisplayName("getDeadline: -> return deadline")
    public void testGetDeadline_ReturnDeadline() {
        Tema tema = new Tema(null, null, -255, 0);

        int actual = tema.getDeadline();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.setDeadline

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDeadline(int)

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#setDeadline(int)}
     * @utbot.returnsFrom {@code public void setDeadline(int deadline) {
     * this.deadline = deadline;
     * }}
     */
    @Test
    @DisplayName("setDeadline: -> public void setDeadline(int deadline) { this.deadline = deadline }")
    public void testSetDeadline_Return() {
        Tema tema = new Tema(null, null, -255, 0);

        tema.setDeadline(-255);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.getStartline

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartline()

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#getStartline()}
     * @utbot.returnsFrom {@code return startline;}
     */
    @Test
    @DisplayName("getStartline: -> return startline")
    public void testGetStartline_ReturnStartline() {
        Tema tema = new Tema(null, null, 0, -255);

        int actual = tema.getStartline();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.setStartline

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStartline(int)

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#setStartline(int)}
     * @utbot.returnsFrom {@code public void setStartline(int startline) {
     * this.startline = startline;
     * }}
     */
    @Test
    @DisplayName("setStartline: -> public void setStartline(int startline) { this.startline = startline }")
    public void testSetStartline_Return() {
        Tema tema = new Tema(null, null, 0, -255);

        tema.setStartline(-255);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.toString

    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()

    @Test
    public void testToString1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Tema tema = new Tema(string, null, 0, 0);

        String actual = tema.toString();

        String expected = "Tema{id='\u0000\u0000\u0000\u0000\u0000\u0000\u0000', descriere='null, deadline=0, startline=0}";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.equals

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#equals(Object)}
     * @utbot.executesCondition {@code (o): False}
     * @utbot.executesCondition {@code (o == null): False}
     * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("equals: o == null : True -> return false")
    public void testEquals_GetClassNotEqualsOGetClass() {
        Tema tema = new Tema(null, null, 0, 0);
        int[] o = {};

        boolean actual = tema.equals(o);

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#equals(Object)}
     * @utbot.executesCondition {@code (o): True}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("equals: o : True -> return true")
    public void testEquals_O() {
        Tema tema = new Tema(null, null, 0, 0);

        boolean actual = tema.equals(tema);

        assertTrue(actual);
    }

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#equals(Object)}
     * @utbot.executesCondition {@code (o): False}
     * @utbot.executesCondition {@code (o == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("equals: o == null : False -> return false")
    public void testEquals_OEqualsNull() {
        Tema tema = new Tema(null, null, 0, 0);

        boolean actual = tema.equals(null);

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Tema.hashCode

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()

    /**
     * @utbot.classUnderTest {@link Tema}
     * @utbot.methodUnderTest {@link Tema#hashCode()}
     * @utbot.invokes {@link java.util.Objects#hash(Object[])}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("hashCode: ObjectsHash -> public ")
    public void testHashCode_ObjectsHash() {
        Tema tema = new Tema(null, null, 0, 0);

        int actual = tema.hashCode();

        assertEquals(31, actual);
    }
    ///endregion

    ///endregion
}
