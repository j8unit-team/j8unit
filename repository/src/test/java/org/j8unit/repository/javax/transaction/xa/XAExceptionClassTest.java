package org.j8unit.repository.javax.transaction.xa;

import javax.transaction.xa.XAException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XAException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.transaction.xa.XAExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class XAExceptionClassTest
implements XAExceptionClassTests<XAException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.xa.XAException]

    @Override
    public Class<XAException> createNewSUT() {
        return XAException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.transaction.xa.XAException#XAException()
     * public javax.transaction.xa.XAException()}.
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
    public void create_XAException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XAException sut = new XAException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.xa.XAException#XAException(String) public
     * javax.transaction.xa.XAException(java.lang.String)}.
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
    public void create_XAException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XAException sut = null; // = new XAException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.xa.XAException#XAException(int) public javax.transaction.xa.XAException(int)}.
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
    public void create_XAException_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XAException sut = null; // = new XAException(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.xa.XAException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.xa.XAException]

}
