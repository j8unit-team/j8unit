package org.j8unit.repository.java.io;

import java.io.BufferedWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BufferedWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.BufferedWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferedWriterClassTest
implements BufferedWriterClassTests<BufferedWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.BufferedWriter]

    @Override
    public Class<BufferedWriter> createNewSUT() {
        return BufferedWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.BufferedWriter#BufferedWriter(java.io.Writer) public java.io.BufferedWriter(java.io.Writer)}.
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
    public void create_BufferedWriter_Writer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedWriter sut = null; // = new BufferedWriter(java.io.Writer);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.BufferedWriter#BufferedWriter(java.io.Writer, int) public
     * java.io.BufferedWriter(java.io.Writer,int)}.
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
    public void create_BufferedWriter_Writer_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedWriter sut = null; // = new BufferedWriter(java.io.Writer, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.BufferedWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.BufferedWriter]

}
