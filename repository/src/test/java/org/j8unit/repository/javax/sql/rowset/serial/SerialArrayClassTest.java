package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialArray;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SerialArray} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.serial.SerialArrayClassTests}).
 */

@RunWith(J8Unit4.class)
public class SerialArrayClassTest
implements SerialArrayClassTests<SerialArray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SerialArray]

    @Override
    public Class<SerialArray> createNewSUT() {
        return SerialArray.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialArray#SerialArray(java.sql.Array) public
     * javax.sql.rowset.serial.SerialArray(java.sql.Array) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SerialArray_Array()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialArray sut = null; // = new SerialArray(java.sql.Array);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialArray#SerialArray(java.sql.Array, java.util.Map) public
     * javax.sql.rowset.serial.SerialArray(java.sql.Array,java.util.Map<java.lang.String, java.lang.Class<?>>) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SerialArray_Array_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialArray sut = null; // = new SerialArray(java.sql.Array, java.util.Map);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.serial.SerialArray]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SerialArray]

}
