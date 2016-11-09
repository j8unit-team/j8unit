package org.j8unit.repository.java.io;

import java.io.StringWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StringWriter} (by simply reusing the
 * J8Unit test interface {@link StringWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class StringWriterClassTest
implements StringWriterClassTests<StringWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.StringWriter]

    @Override
    public Class<StringWriter> createNewSUT() {
        return StringWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.StringWriter#StringWriter() public
     * java.io.StringWriter()}.
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
    public void create_StringWriter()
    throws Exception {
        // create new instance
        final StringWriter sut = new StringWriter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.StringWriter#StringWriter(int) public
     * java.io.StringWriter(int)}.
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
    public void create_StringWriter_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringWriter sut = null; // = new StringWriter(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.StringWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.StringWriter]

}
