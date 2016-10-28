package org.j8unit.repository.java.io;

import java.io.IOException;
import java.io.UncheckedIOException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UncheckedIOExceptionClassTest
implements org.j8unit.repository.java.io.UncheckedIOExceptionClassTests<UncheckedIOException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.UncheckedIOException]

    @Override
    public Class<UncheckedIOException> createNewSUT() {
        return UncheckedIOException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UncheckedIOException#UncheckedIOException(String, IOException) public
     * java.io.UncheckedIOException(java.lang.String,java.io.IOException)}.
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
    public void create_UncheckedIOException_String_IOException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UncheckedIOException sut = null; // = new UncheckedIOException(String, IOException);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link UncheckedIOException#UncheckedIOException(IOException) public
     * java.io.UncheckedIOException(java.io.IOException)}.
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
    public void create_UncheckedIOException_IOException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UncheckedIOException sut = null; // = new UncheckedIOException(IOException);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.UncheckedIOException]

}
