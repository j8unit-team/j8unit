package org.j8unit.repository.java.io;

import java.io.NotActiveException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotActiveExceptionClassTest
implements org.j8unit.repository.java.io.NotActiveExceptionClassTests<NotActiveException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.NotActiveException]

    @Override
    public Class<NotActiveException> createNewSUT() {
        return NotActiveException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.NotActiveException#NotActiveException(String) public java.io.NotActiveException(java.lang.String)}
     * .
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
    public void create_NotActiveException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotActiveException sut = null; // = new NotActiveException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.NotActiveException#NotActiveException()
     * public java.io.NotActiveException()}.
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
    public void create_NotActiveException()
    throws Exception {
        // create new instance
        final NotActiveException sut = new NotActiveException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.NotActiveException]

}
