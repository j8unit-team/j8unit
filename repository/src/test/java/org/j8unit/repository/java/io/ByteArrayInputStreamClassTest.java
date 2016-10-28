package org.j8unit.repository.java.io;

import java.io.ByteArrayInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteArrayInputStreamClassTest
implements org.j8unit.repository.java.io.ByteArrayInputStreamClassTests<ByteArrayInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ByteArrayInputStream]

    @Override
    public Class<ByteArrayInputStream> createNewSUT() {
        return ByteArrayInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ByteArrayInputStream#ByteArrayInputStream(byte[]) public java.io.ByteArrayInputStream(byte[])}.
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
    public void create_ByteArrayInputStream_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ByteArrayInputStream sut = null; // = new ByteArrayInputStream(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ByteArrayInputStream#ByteArrayInputStream(byte[], int, int) public
     * java.io.ByteArrayInputStream(byte[],int,int)}.
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
    public void create_ByteArrayInputStream_byteArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ByteArrayInputStream sut = null; // = new ByteArrayInputStream(byte[], int, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ByteArrayInputStream]

}
