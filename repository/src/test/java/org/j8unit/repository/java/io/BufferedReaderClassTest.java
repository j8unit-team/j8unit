package org.j8unit.repository.java.io;

import java.io.BufferedReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedReaderClassTest
implements org.j8unit.repository.java.io.BufferedReaderClassTests<BufferedReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.BufferedReader]

    @Override
    public Class<BufferedReader> createNewSUT() {
        return BufferedReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.BufferedReader#BufferedReader(java.io.Reader, int) public
     * java.io.BufferedReader(java.io.Reader,int)}.
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
    public void create_BufferedReader_Reader_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedReader sut = null; // = new BufferedReader(java.io.Reader, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.BufferedReader#BufferedReader(java.io.Reader) public java.io.BufferedReader(java.io.Reader)}.
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
    public void create_BufferedReader_Reader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedReader sut = null; // = new BufferedReader(java.io.Reader);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.BufferedReader]

}
