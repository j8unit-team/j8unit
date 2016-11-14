package org.j8unit.repository.java.security;

import java.security.Timestamp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Timestamp} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.TimestampClassTests}).
 */

@RunWith(J8Unit4.class)
public class TimestampClassTest
implements TimestampClassTests<Timestamp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Timestamp]

    @Override
    public Class<Timestamp> createNewSUT() {
        return Timestamp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.Timestamp#Timestamp(java.util.Date, java.security.cert.CertPath) public
     * java.security.Timestamp(java.util.Date,java.security.cert.CertPath)}.
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
    public void create_Timestamp_Date_CertPath()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Timestamp sut = null; // = new Timestamp(java.util.Date, java.security.cert.CertPath);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Timestamp]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Timestamp]

}
