package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.OctetStreamData;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OctetStreamData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.OctetStreamDataClassTests}).
 */

@RunWith(J8Unit4.class)
public class OctetStreamDataClassTest
implements OctetStreamDataClassTests<OctetStreamData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.OctetStreamData]

    @Override
    public Class<OctetStreamData> createNewSUT() {
        return OctetStreamData.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.OctetStreamData#OctetStreamData(java.io.InputStream, String, String) public
     * javax.xml.crypto.OctetStreamData(java.io.InputStream,java.lang.String,java.lang.String)}.
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
    public void create_OctetStreamData_InputStream_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OctetStreamData sut = null; // = new OctetStreamData(java.io.InputStream, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.OctetStreamData#OctetStreamData(java.io.InputStream) public
     * javax.xml.crypto.OctetStreamData(java.io.InputStream)}.
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
    public void create_OctetStreamData_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OctetStreamData sut = null; // = new OctetStreamData(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.OctetStreamData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.OctetStreamData]

}
