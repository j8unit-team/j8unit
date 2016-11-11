package org.j8unit.repository.java.io;

import java.io.LineNumberInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LineNumberInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.LineNumberInputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class LineNumberInputStreamClassTest
implements LineNumberInputStreamClassTests<LineNumberInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.LineNumberInputStream]

    @Override
    public Class<LineNumberInputStream> createNewSUT() {
        return LineNumberInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.LineNumberInputStream#LineNumberInputStream(java.io.InputStream) public
     * java.io.LineNumberInputStream(java.io.InputStream)}.
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
    public void create_LineNumberInputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LineNumberInputStream sut = null; // = new LineNumberInputStream(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.LineNumberInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.LineNumberInputStream]

}
