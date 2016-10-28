package org.j8unit.repository.java.io;

import java.io.IOException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IOExceptionClassTest
implements org.j8unit.repository.java.io.IOExceptionClassTests<IOException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.IOException]

    @Override
    public Class<IOException> createNewSUT() {
        return IOException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IOException#IOException(Throwable) public
     * java.io.IOException(java.lang.Throwable)}.
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
    public void create_IOException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IOException sut = null; // = new IOException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IOException#IOException(String, Throwable)
     * public java.io.IOException(java.lang.String,java.lang.Throwable)}.
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
    public void create_IOException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IOException sut = null; // = new IOException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IOException#IOException(String) public
     * java.io.IOException(java.lang.String)}.
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
    public void create_IOException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IOException sut = null; // = new IOException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IOException#IOException() public
     * java.io.IOException()}.
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
    public void create_IOException()
    throws Exception {
        // create new instance
        final IOException sut = new IOException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.IOException]

}
