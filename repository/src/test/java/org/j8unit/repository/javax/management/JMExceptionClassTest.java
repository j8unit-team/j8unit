package org.j8unit.repository.javax.management;

import javax.management.JMException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMExceptionClassTest
implements org.j8unit.repository.javax.management.JMExceptionClassTests<JMException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.JMException]

    @Override
    public Class<JMException> createNewSUT() {
        return JMException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link JMException#JMException() public
     * javax.management.JMException()}.
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
    public void create_JMException()
    throws Exception {
        // create new instance
        final JMException sut = new JMException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link JMException#JMException(String) public
     * javax.management.JMException(java.lang.String)}.
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
    public void create_JMException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMException sut = null; // = new JMException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.JMException]

}
