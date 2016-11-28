package org.j8unit.repository.java.io;

import java.io.PipedOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PipedOutputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.PipedOutputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class PipedOutputStreamClassTest
implements org.j8unit.repository.java.io.PipedOutputStreamClassTests<PipedOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.PipedOutputStream]

    @Override
    public Class<PipedOutputStream> createNewSUT() {
        return PipedOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.PipedOutputStream#PipedOutputStream(java.io.PipedInputStream) public
     * java.io.PipedOutputStream(java.io.PipedInputStream) throws java.io.IOException}.
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
    public void create_PipedOutputStream_PipedInputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedOutputStream sut = null; // = new PipedOutputStream(java.io.PipedInputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.PipedOutputStream#PipedOutputStream()
     * public java.io.PipedOutputStream()}.
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
    public void create_PipedOutputStream()
    throws Exception {
        // create new instance
        try (final PipedOutputStream sut = new PipedOutputStream()) {}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.PipedOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.PipedOutputStream]

}
