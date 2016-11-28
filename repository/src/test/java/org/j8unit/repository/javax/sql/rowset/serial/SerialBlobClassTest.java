package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialBlob;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SerialBlob} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.rowset.serial.SerialBlobClassTests}).
 */
@RunWith(J8Unit4.class)
public class SerialBlobClassTest
implements SerialBlobClassTests<SerialBlob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SerialBlob]

    @Override
    public Class<SerialBlob> createNewSUT() {
        return SerialBlob.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialBlob#SerialBlob(byte[]) public javax.sql.rowset.serial.SerialBlob(byte[])
     * throws javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
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
    public void create_SerialBlob_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialBlob sut = null; // = new SerialBlob(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialBlob#SerialBlob(java.sql.Blob) public
     * javax.sql.rowset.serial.SerialBlob(java.sql.Blob) throws
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
    public void create_SerialBlob_Blob()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialBlob sut = null; // = new SerialBlob(java.sql.Blob);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.serial.SerialBlob]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SerialBlob]

}
