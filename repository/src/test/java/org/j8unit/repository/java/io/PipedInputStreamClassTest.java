package org.j8unit.repository.java.io;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedInputStreamClassTest
implements org.j8unit.repository.java.io.PipedInputStreamClassTests<PipedInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.PipedInputStream]

    @Override
    public Class<PipedInputStream> createNewSUT() {
        return PipedInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PipedInputStream#PipedInputStream(int) public
     * java.io.PipedInputStream(int)}.
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
    public void create_PipedInputStream_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedInputStream sut = null; // = new PipedInputStream(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PipedInputStream#PipedInputStream() public
     * java.io.PipedInputStream()}.
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
    public void create_PipedInputStream()
    throws Exception {
        // create new instance
        final PipedInputStream sut = new PipedInputStream();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PipedInputStream#PipedInputStream(PipedOutputStream, int) public
     * java.io.PipedInputStream(java.io.PipedOutputStream,int) throws java.io.IOException}.
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
    public void create_PipedInputStream_PipedOutputStream_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedInputStream sut = null; // = new PipedInputStream(PipedOutputStream, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PipedInputStream#PipedInputStream(PipedOutputStream) public
     * java.io.PipedInputStream(java.io.PipedOutputStream) throws java.io.IOException}.
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
    public void create_PipedInputStream_PipedOutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PipedInputStream sut = null; // = new PipedInputStream(PipedOutputStream);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.PipedInputStream]

}
