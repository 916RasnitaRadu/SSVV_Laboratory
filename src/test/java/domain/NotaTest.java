package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.java.UtUtils.getFieldValue;

public final class NotaTest {
    ///region Test suites for executable domain.Nota.getID

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getID()

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#getID()}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("getID: -> public ")
    public void testGetID_Return() {
        Nota nota = new Nota(null, 0.0, 0, null);

        Pair actual = nota.getID();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.setID

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setID(domain.Pair)

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#setID(Pair)}
     * @utbot.returnsFrom {@code public }
     */
    @Test
    @DisplayName("setID: -> public ")
    public void testSetID_Return() {
        Nota nota = new Nota(null, 0.0, 0, null);

        nota.setID(((Pair) null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.getNota

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNota()

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#getNota()}
     * @utbot.returnsFrom {@code return nota;}
     */
    @Test
    @DisplayName("getNota: -> return nota")
    public void testGetNota_ReturnNota() {
        Nota nota = new Nota(null, 0.0, 0, null);

        double actual = nota.getNota();

        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.setNota

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNota(double)

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#setNota(double)}
     * @utbot.returnsFrom {@code public void setNota(double nota) {
     * this.nota = nota;
     * }}
     */
    @Test
    @DisplayName("setNota: -> public void setNota(double nota) { this.nota = nota }")
    public void testSetNota_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Nota nota = new Nota(null, 0.0, 0, null);

        nota.setNota(Double.NaN);

        double finalNotaNota = ((Double) getFieldValue(nota, "domain.Nota", "nota"));

        assertEquals(Double.NaN, finalNotaNota, 1.0E-6);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.getSaptamanaPredare

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSaptamanaPredare()

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#getSaptamanaPredare()}
     * @utbot.returnsFrom {@code return saptamanaPredare;}
     */
    @Test
    @DisplayName("getSaptamanaPredare: -> return saptamanaPredare")
    public void testGetSaptamanaPredare_ReturnSaptamanaPredare() {
        Nota nota = new Nota(null, 0.0, -255, null);

        int actual = nota.getSaptamanaPredare();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.setSaptamanaPredare

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSaptamanaPredare(int)

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#setSaptamanaPredare(int)}
     * @utbot.returnsFrom {@code public void setSaptamanaPredare(int saptamanaPredare) {
     * this.saptamanaPredare = saptamanaPredare;
     * }}
     */
    @Test
    @DisplayName("setSaptamanaPredare: -> public void setSaptamanaPredare(int saptamanaPredare) { this.saptamanaPredare = saptamanaPredare }")
    public void testSetSaptamanaPredare_Return() {
        Nota nota = new Nota(null, 0.0, -255, null);

        nota.setSaptamanaPredare(-255);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.getFeedback

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedback()

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#getFeedback()}
     * @utbot.returnsFrom {@code return feedback;}
     */
    @Test
    @DisplayName("getFeedback: -> return feedback")
    public void testGetFeedback_ReturnFeedback() {
        Nota nota = new Nota(null, 0.0, 0, null);

        String actual = nota.getFeedback();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.setFeedback

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFeedback(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#setFeedback(String)}
     * @utbot.returnsFrom {@code public void setFeedback(String feedback) {
     * this.feedback = feedback;
     * }}
     */
    @Test
    @DisplayName("setFeedback: -> public void setFeedback(String feedback) { this.feedback = feedback }")
    public void testSetFeedback_Return() {
        Nota nota = new Nota(null, 0.0, 0, null);

        nota.setFeedback(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Nota.toString

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#toString()}
     * @utbot.invokes {@link Pair#getObject1()}
     * @utbot.throwsException {@link NullPointerException} in: "id_student = "
     */
    @Test
    @DisplayName("toString: \"id_student = \" -> ThrowNullPointerException")
    public void testToString_PairGetObject1() {
        Nota nota = new Nota(null, 0.0, 0, null);
        
        /* This test fails because method [domain.Nota.toString] produces [java.lang.NullPointerException]
            domain.Nota.toString(Nota.java:37) */
        nota.toString();
    }

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#toString()}
     * @utbot.throwsException {@link ClassCastException} in: ", id_tema = "
     */
    @Test
    @DisplayName("toString: \", id_tema = \" -> ThrowClassCastException")
    public void testToString_ThrowClassCastException() {
        byte[] byteArray = {};
        Pair pair = new Pair(byteArray, null);
        Nota nota = new Nota(pair, 0.0, 0, null);
        
        /* This test fails because method [domain.Nota.toString] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            domain.Nota.toString(Nota.java:37) */
        nota.toString();
    }

    /**
     * @utbot.classUnderTest {@link Nota}
     * @utbot.methodUnderTest {@link Nota#toString()}
     * @utbot.invokes {@link Pair#getObject2()}
     * @utbot.throwsException {@link ClassCastException} in: ", id_tema = "
     */
    @Test
    @DisplayName("toString: \", id_tema = \" -> ThrowClassCastException")
    public void testToString_PairGetObject2() {
        byte[] byteArray = {};
        Pair pair = new Pair(null, byteArray);
        Nota nota = new Nota(pair, 0.0, 0, null);
        
        /* This test fails because method [domain.Nota.toString] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            domain.Nota.toString(Nota.java:38) */
        nota.toString();
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()

    @Test
    public void testToString1() {
        String string = "";
        Pair pair = new Pair(string, string);
        Nota nota = new Nota(pair, 0.0, 0, null);

        String actual = nota.toString();

        String expected = "Nota{id_student = , id_tema = , nota = 0.0, saptamanaPredare = 0, feedback = 'null'}";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
