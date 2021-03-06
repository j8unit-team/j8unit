package org.j8unit.repository.java.io;

import java.io.StreamTokenizer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StreamTokenizer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.StreamTokenizerClassTests}).
 */
@RunWith(J8Unit4.class)
public class StreamTokenizerClassTest
implements StreamTokenizerClassTests<StreamTokenizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.StreamTokenizer]

    @Override
    public Class<StreamTokenizer> createNewSUT() {
        return StreamTokenizer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.StreamTokenizer#StreamTokenizer(java.io.InputStream) public
     * java.io.StreamTokenizer(java.io.InputStream)}.
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
    public void create_StreamTokenizer_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StreamTokenizer sut = null; // = new StreamTokenizer(java.io.InputStream);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.StreamTokenizer#StreamTokenizer(java.io.Reader) public java.io.StreamTokenizer(java.io.Reader)}.
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
    public void create_StreamTokenizer_Reader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StreamTokenizer sut = null; // = new StreamTokenizer(java.io.Reader);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.StreamTokenizer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.StreamTokenizer]

}
