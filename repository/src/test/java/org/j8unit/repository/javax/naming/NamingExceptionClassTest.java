package org.j8unit.repository.javax.naming;

import javax.naming.NamingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionClassTest
implements org.j8unit.repository.javax.naming.NamingExceptionClassTests<NamingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NamingException]

    @Override
    public Class<NamingException> createNewSUT() {
        return NamingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NamingException#NamingException(String) public
     * javax.naming.NamingException(java.lang.String)}.
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
    public void create_NamingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NamingException sut = null; // = new NamingException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.naming.NamingException#NamingException()
     * public javax.naming.NamingException()}.
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
    public void create_NamingException()
    throws Exception {
        // create new instance
        final NamingException sut = new NamingException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NamingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NamingException]

}
