package org.j8unit.repository.javax.naming;

import javax.naming.ContextNotEmptyException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextNotEmptyExceptionClassTest
implements org.j8unit.repository.javax.naming.ContextNotEmptyExceptionClassTests<ContextNotEmptyException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ContextNotEmptyException]

    @Override
    public Class<ContextNotEmptyException> createNewSUT() {
        return ContextNotEmptyException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ContextNotEmptyException#ContextNotEmptyException(String) public
     * javax.naming.ContextNotEmptyException(java.lang.String)}.
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
    public void create_ContextNotEmptyException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ContextNotEmptyException sut = null; // = new ContextNotEmptyException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ContextNotEmptyException#ContextNotEmptyException() public
     * javax.naming.ContextNotEmptyException()}.
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
    public void create_ContextNotEmptyException()
    throws Exception {
        // create new instance
        final ContextNotEmptyException sut = new ContextNotEmptyException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ContextNotEmptyException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ContextNotEmptyException]

}
