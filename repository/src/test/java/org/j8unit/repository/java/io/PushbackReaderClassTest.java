package org.j8unit.repository.java.io;

import java.io.PushbackReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PushbackReader} (by simply reusing the
 * J8Unit test interface {@link PushbackReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class PushbackReaderClassTest
implements PushbackReaderClassTests<PushbackReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.PushbackReader]

    @Override
    public Class<PushbackReader> createNewSUT() {
        return PushbackReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.PushbackReader#PushbackReader(java.io.Reader, int) public
     * java.io.PushbackReader(java.io.Reader,int)}.
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
    public void create_PushbackReader_Reader_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PushbackReader sut = null; // = new PushbackReader(java.io.Reader, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.PushbackReader#PushbackReader(java.io.Reader) public java.io.PushbackReader(java.io.Reader)}.
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
    public void create_PushbackReader_Reader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PushbackReader sut = null; // = new PushbackReader(java.io.Reader);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.PushbackReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.PushbackReader]

}
