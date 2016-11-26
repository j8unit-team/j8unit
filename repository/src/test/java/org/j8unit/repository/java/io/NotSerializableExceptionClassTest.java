package org.j8unit.repository.java.io;

import java.io.NotSerializableException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotSerializableException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.NotSerializableExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotSerializableExceptionClassTest
implements NotSerializableExceptionClassTests<NotSerializableException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.NotSerializableException]

    @Override
    public Class<NotSerializableException> createNewSUT() {
        return NotSerializableException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.NotSerializableException#NotSerializableException(String) public
     * java.io.NotSerializableException(java.lang.String)}.
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
    public void create_NotSerializableException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotSerializableException sut = null; // = new NotSerializableException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.NotSerializableException#NotSerializableException() public java.io.NotSerializableException()}.
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
    public void create_NotSerializableException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotSerializableException sut = new NotSerializableException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.NotSerializableException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.NotSerializableException]

}
