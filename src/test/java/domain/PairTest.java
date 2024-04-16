package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class PairTest {
    ///region Test suites for executable domain.Pair.getObject1

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObject1()

    /**
     * @utbot.classUnderTest {@link Pair}
     * @utbot.methodUnderTest {@link Pair#getObject1()}
     * @utbot.returnsFrom {@code return object1;}
     */
    @Test
    @DisplayName("getObject1: -> return object1")
    public void testGetObject1_ReturnObject1() {
        Pair pair = new Pair(null, null);

        Object actual = pair.getObject1();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Pair.getObject2

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObject2()

    /**
     * @utbot.classUnderTest {@link Pair}
     * @utbot.methodUnderTest {@link Pair#getObject2()}
     * @utbot.returnsFrom {@code return object2;}
     */
    @Test
    @DisplayName("getObject2: -> return object2")
    public void testGetObject2_ReturnObject2() {
        Pair pair = new Pair(null, null);

        Object actual = pair.getObject2();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Pair.equals

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)

    /**
     * @utbot.classUnderTest {@link Pair}
     * @utbot.methodUnderTest {@link Pair#equals(Object)}
     * @utbot.executesCondition {@code (o): False}
     * @utbot.executesCondition {@code (o == null): False}
     * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("equals: o == null : True -> return false")
    public void testEquals_GetClassNotEqualsOGetClass() {
        Pair pair = new Pair(null, null);
        int[] o = {};

        boolean actual = pair.equals(o);

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link Pair}
     * @utbot.methodUnderTest {@link Pair#equals(Object)}
     * @utbot.executesCondition {@code (o): True}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("equals: o : True -> return true")
    public void testEquals_O() {
        Pair pair = new Pair(null, null);

        boolean actual = pair.equals(pair);

        assertTrue(actual);
    }

    /**
     * @utbot.classUnderTest {@link Pair}
     * @utbot.methodUnderTest {@link Pair#equals(Object)}
     * @utbot.executesCondition {@code (o): False}
     * @utbot.executesCondition {@code (o == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("equals: o == null : False -> return false")
    public void testEquals_OEqualsNull() {
        Pair pair = new Pair(null, null);

        boolean actual = pair.equals(null);

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable domain.Pair.hashCode

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()

    /**
     * @utbot.classUnderTest {@link Pair}
     * @utbot.methodUnderTest {@link Pair#hashCode()}
     * @utbot.invokes {@link java.util.Objects#hash(Object[])}
     * @utbot.returnsFrom {@code return Objects.hash(object1, object2);}
     */
    @Test
    @DisplayName("hashCode: ObjectsHash -> return Objects.hash(object1, object2)")
    public void testHashCode_ObjectsHash() {
        Integer integer = 0;
        Pair pair = new Pair(integer, null);

        int actual = pair.hashCode();

        assertEquals(961, actual);
    }
    ///endregion

    ///region Errors report for hashCode

    public void testHashCode_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Concrete execution failed

    }
    ///endregion

    ///endregion
}
