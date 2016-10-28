package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialExceptionClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialExceptionClassTests<SerialException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SerialException]

    @Override
    public Class<SerialException> createNewSUT() {
        return SerialException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialException#SerialException() public
     * javax.sql.rowset.serial.SerialException()}.
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
    public void create_SerialException()
    throws Exception {
        // create new instance
        final SerialException sut = new SerialException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialException#SerialException(String) public
     * javax.sql.rowset.serial.SerialException(java.lang.String)}.
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
    public void create_SerialException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialException sut = null; // = new SerialException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SerialException]

}
