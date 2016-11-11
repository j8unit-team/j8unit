package org.j8unit.repository.java.io;

import java.io.DataInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataInputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.DataInputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class DataInputStreamClassTest
implements DataInputStreamClassTests<DataInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.DataInputStream]

    @Override
    public Class<DataInputStream> createNewSUT() {
        return DataInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.DataInputStream#DataInputStream(java.io.InputStream) public
     * java.io.DataInputStream(java.io.InputStream)}.
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
    public void create_DataInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DataInputStream sut = null; // = new DataInputStream(java.io.InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.io.DataInputStream#readUTF(java.io.DataInput)
     * public static final java.lang.String java.io.DataInputStream.readUTF(java.io.DataInput) throws
     * java.io.IOException}.
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
    public void test_readUTF_DataInput()
    throws Exception {
        // write some test for {@link java.io.DataInputStream#readUTF(java.io.DataInput)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.DataInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.DataInputStream]

}
