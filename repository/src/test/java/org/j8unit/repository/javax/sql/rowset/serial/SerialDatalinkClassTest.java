package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SerialDatalink;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SerialDatalink} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.serial.SerialDatalinkClassTests}).
 */

@RunWith(J8Unit4.class)
public class SerialDatalinkClassTest
implements SerialDatalinkClassTests<SerialDatalink> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SerialDatalink]

    @Override
    public Class<SerialDatalink> createNewSUT() {
        return SerialDatalink.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SerialDatalink#SerialDatalink(java.net.URL) public
     * javax.sql.rowset.serial.SerialDatalink(java.net.URL) throws javax.sql.rowset.serial.SerialException}.
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
    public void create_SerialDatalink_URL()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerialDatalink sut = null; // = new SerialDatalink(java.net.URL);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.serial.SerialDatalink]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SerialDatalink]

}
