package org.j8unit.repository.java.io;

import java.io.ByteArrayOutputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteArrayOutputStreamClassTest
implements org.j8unit.repository.java.io.ByteArrayOutputStreamClassTests<ByteArrayOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ByteArrayOutputStream]

    @Override
    public Class<ByteArrayOutputStream> createNewSUT() {
        return ByteArrayOutputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.ByteArrayOutputStream#ByteArrayOutputStream() public java.io.ByteArrayOutputStream()}.
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
    public void create_ByteArrayOutputStream()
    throws Exception {
        // create new instance
        final ByteArrayOutputStream sut = new ByteArrayOutputStream();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.ByteArrayOutputStream#ByteArrayOutputStream(int) public java.io.ByteArrayOutputStream(int)}.
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
    public void create_ByteArrayOutputStream_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ByteArrayOutputStream sut = null; // = new ByteArrayOutputStream(int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ByteArrayOutputStream]

}
