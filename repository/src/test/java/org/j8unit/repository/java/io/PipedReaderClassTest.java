package org.j8unit.repository.java.io;

import java.io.PipedReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PipedReader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.PipedReaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class PipedReaderClassTest
implements PipedReaderClassTests<PipedReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.PipedReader]

    @Override
    public Class<PipedReader> createNewSUT() {
        return PipedReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.PipedReader#PipedReader(java.io.PipedWriter) public java.io.PipedReader(java.io.PipedWriter)
     * throws java.io.IOException}.
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
    public void create_PipedReader_PipedWriter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedReader sut = null; // = new PipedReader(java.io.PipedWriter);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.PipedReader#PipedReader(java.io.PipedWriter, int) public
     * java.io.PipedReader(java.io.PipedWriter,int) throws java.io.IOException}.
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
    public void create_PipedReader_PipedWriter_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedReader sut = null; // = new PipedReader(java.io.PipedWriter, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.PipedReader#PipedReader(int) public
     * java.io.PipedReader(int)}.
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
    public void create_PipedReader_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedReader sut = null; // = new PipedReader(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.PipedReader#PipedReader() public
     * java.io.PipedReader()}.
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
    public void create_PipedReader()
    throws Exception {
        // create new instance
        try (final PipedReader sut = new PipedReader()) {}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.PipedReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.PipedReader]

}
