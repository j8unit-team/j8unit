package org.j8unit.repository.java.io;

import java.io.PipedWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PipedWriter} (by simply reusing the
 * J8Unit test interface {@link PipedWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class PipedWriterClassTest
implements PipedWriterClassTests<PipedWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.PipedWriter]

    @Override
    public Class<PipedWriter> createNewSUT() {
        return PipedWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.PipedWriter#PipedWriter(java.io.PipedReader) public java.io.PipedWriter(java.io.PipedReader)
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
    public void create_PipedWriter_PipedReader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedWriter sut = null; // = new PipedWriter(java.io.PipedReader);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.PipedWriter#PipedWriter() public
     * java.io.PipedWriter()}.
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
    public void create_PipedWriter()
    throws Exception {
        // create new instance
        final PipedWriter sut = new PipedWriter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.PipedWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.PipedWriter]

}
