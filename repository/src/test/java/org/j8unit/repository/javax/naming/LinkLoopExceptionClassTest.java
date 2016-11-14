package org.j8unit.repository.javax.naming;

import javax.naming.LinkLoopException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LinkLoopException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.LinkLoopExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class LinkLoopExceptionClassTest
implements LinkLoopExceptionClassTests<LinkLoopException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.LinkLoopException]

    @Override
    public Class<LinkLoopException> createNewSUT() {
        return LinkLoopException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.LinkLoopException#LinkLoopException(String) public
     * javax.naming.LinkLoopException(java.lang.String)}.
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
    public void create_LinkLoopException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkLoopException sut = null; // = new LinkLoopException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.LinkLoopException#LinkLoopException() public javax.naming.LinkLoopException()}.
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
    public void create_LinkLoopException()
    throws Exception {
        // create new instance
        final LinkLoopException sut = new LinkLoopException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.LinkLoopException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.LinkLoopException]

}