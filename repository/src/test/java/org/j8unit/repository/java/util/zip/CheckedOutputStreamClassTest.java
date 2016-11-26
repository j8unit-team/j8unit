package org.j8unit.repository.java.util.zip;

import java.util.zip.CheckedOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CheckedOutputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.zip.CheckedOutputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class CheckedOutputStreamClassTest
implements CheckedOutputStreamClassTests<CheckedOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.CheckedOutputStream]

    @Override
    public Class<CheckedOutputStream> createNewSUT() {
        return CheckedOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.zip.CheckedOutputStream#CheckedOutputStream(java.io.OutputStream, java.util.zip.Checksum) public
     * java.util.zip.CheckedOutputStream(java.io.OutputStream,java.util.zip.Checksum)}.
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
    public void create_CheckedOutputStream_OutputStream_Checksum()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CheckedOutputStream sut = null; // = new CheckedOutputStream(java.io.OutputStream,
                                              // java.util.zip.Checksum);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.CheckedOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.CheckedOutputStream]

}
