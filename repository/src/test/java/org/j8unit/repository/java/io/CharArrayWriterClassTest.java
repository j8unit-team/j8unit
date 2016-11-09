package org.j8unit.repository.java.io;

import java.io.CharArrayWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharArrayWriter} (by simply reusing the
 * J8Unit test interface {@link CharArrayWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharArrayWriterClassTest
implements CharArrayWriterClassTests<CharArrayWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.CharArrayWriter]

    @Override
    public Class<CharArrayWriter> createNewSUT() {
        return CharArrayWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.CharArrayWriter#CharArrayWriter()
     * public java.io.CharArrayWriter()}.
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
    public void create_CharArrayWriter()
    throws Exception {
        // create new instance
        final CharArrayWriter sut = new CharArrayWriter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.CharArrayWriter#CharArrayWriter(int)
     * public java.io.CharArrayWriter(int)}.
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
    public void create_CharArrayWriter_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharArrayWriter sut = null; // = new CharArrayWriter(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.CharArrayWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.CharArrayWriter]

}
