package org.j8unit.repository.java.nio.file;

import java.nio.file.AccessDeniedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessDeniedExceptionClassTest
implements org.j8unit.repository.java.nio.file.AccessDeniedExceptionClassTests<AccessDeniedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.AccessDeniedException]

    @Override
    public Class<AccessDeniedException> createNewSUT() {
        return AccessDeniedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.AccessDeniedException#AccessDeniedException(String) public
     * java.nio.file.AccessDeniedException(java.lang.String)}.
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
    public void create_AccessDeniedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessDeniedException sut = null; // = new AccessDeniedException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.AccessDeniedException#AccessDeniedException(String, String, String) public
     * java.nio.file.AccessDeniedException(java.lang.String,java.lang.String,java.lang.String)}.
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
    public void create_AccessDeniedException_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessDeniedException sut = null; // = new AccessDeniedException(String, String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.AccessDeniedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.AccessDeniedException]

}
