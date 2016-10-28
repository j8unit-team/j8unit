package org.j8unit.repository.java.io;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SequenceInputStreamClassTest
implements org.j8unit.repository.java.io.SequenceInputStreamClassTests<SequenceInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.SequenceInputStream]

    @Override
    public Class<SequenceInputStream> createNewSUT() {
        return SequenceInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link SequenceInputStream#SequenceInputStream(Enumeration) public
     * java.io.SequenceInputStream(java.util.Enumeration<? extends java.io.InputStream>)}.
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
    public void create_SequenceInputStream_Enumeration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SequenceInputStream sut = null; // = new SequenceInputStream(Enumeration);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link SequenceInputStream#SequenceInputStream(InputStream, InputStream) public
     * java.io.SequenceInputStream(java.io.InputStream,java.io.InputStream)}.
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
    public void create_SequenceInputStream_InputStream_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SequenceInputStream sut = null; // = new SequenceInputStream(InputStream, InputStream);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.SequenceInputStream]

}
