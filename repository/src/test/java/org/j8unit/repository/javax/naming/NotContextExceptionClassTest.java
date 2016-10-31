package org.j8unit.repository.javax.naming;

import javax.naming.NotContextException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotContextExceptionClassTest
implements org.j8unit.repository.javax.naming.NotContextExceptionClassTests<NotContextException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NotContextException]

    @Override
    public Class<NotContextException> createNewSUT() {
        return NotContextException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NotContextException#NotContextException(String) public
     * javax.naming.NotContextException(java.lang.String)}.
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
    public void create_NotContextException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NotContextException sut = null; // = new NotContextException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NotContextException#NotContextException() public javax.naming.NotContextException()}.
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
    public void create_NotContextException()
    throws Exception {
        // create new instance
        final NotContextException sut = new NotContextException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NotContextException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NotContextException]

}
