package org.j8unit.repository.java.io;

import java.io.WriteAbortedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WriteAbortedException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.WriteAbortedExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class WriteAbortedExceptionClassTest
implements WriteAbortedExceptionClassTests<WriteAbortedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.WriteAbortedException]

    @Override
    public Class<WriteAbortedException> createNewSUT() {
        return WriteAbortedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.WriteAbortedException#WriteAbortedException(String, Exception) public
     * java.io.WriteAbortedException(java.lang.String,java.lang.Exception)}.
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
    public void create_WriteAbortedException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WriteAbortedException sut = null; // = new WriteAbortedException(String, Exception);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.WriteAbortedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.WriteAbortedException]

}
