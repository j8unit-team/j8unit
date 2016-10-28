package org.j8unit.repository.javax.naming;

import javax.naming.ServiceUnavailableException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUnavailableExceptionClassTest
implements org.j8unit.repository.javax.naming.ServiceUnavailableExceptionClassTests<ServiceUnavailableException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ServiceUnavailableException]

    @Override
    public Class<ServiceUnavailableException> createNewSUT() {
        return ServiceUnavailableException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ServiceUnavailableException#ServiceUnavailableException(String) public
     * javax.naming.ServiceUnavailableException(java.lang.String)}.
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
    public void create_ServiceUnavailableException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceUnavailableException sut = null; // = new ServiceUnavailableException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ServiceUnavailableException#ServiceUnavailableException() public
     * javax.naming.ServiceUnavailableException()}.
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
    public void create_ServiceUnavailableException()
    throws Exception {
        // create new instance
        final ServiceUnavailableException sut = new ServiceUnavailableException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ServiceUnavailableException]

}
