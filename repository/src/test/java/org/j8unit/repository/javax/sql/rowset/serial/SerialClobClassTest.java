package org.j8unit.repository.javax.sql.rowset.serial;

import java.sql.Clob;
import javax.sql.rowset.serial.SerialClob;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerialClobClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SerialClobClassTests<SerialClob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SerialClob]

    @Override
    public Class<SerialClob> createNewSUT() {
        return SerialClob.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SerialClob#SerialClob(char[]) public
     * javax.sql.rowset.serial.SerialClob(char[]) throws javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
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
    public void create_SerialClob_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialClob sut = null; // = new SerialClob(char[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SerialClob#SerialClob(Clob) public
     * javax.sql.rowset.serial.SerialClob(java.sql.Clob) throws
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
    public void create_SerialClob_Clob()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialClob sut = null; // = new SerialClob(Clob);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SerialClob]

}
