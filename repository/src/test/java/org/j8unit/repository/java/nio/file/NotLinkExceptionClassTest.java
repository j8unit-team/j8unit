package org.j8unit.repository.java.nio.file;

import java.nio.file.NotLinkException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotLinkException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.NotLinkExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotLinkExceptionClassTest
implements NotLinkExceptionClassTests<NotLinkException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.NotLinkException]

    @Override
    public Class<NotLinkException> createNewSUT() {
        return NotLinkException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.NotLinkException#NotLinkException(String) public
     * java.nio.file.NotLinkException(java.lang.String)}.
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
    public void create_NotLinkException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotLinkException sut = null; // = new NotLinkException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.NotLinkException#NotLinkException(String, String, String) public
     * java.nio.file.NotLinkException(java.lang.String,java.lang.String,java.lang.String)}.
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
    public void create_NotLinkException_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotLinkException sut = null; // = new NotLinkException(String, String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.NotLinkException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.NotLinkException]

}
