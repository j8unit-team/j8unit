package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.StartTlsRequest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StartTlsRequest} (by simply reusing the
 * J8Unit test interface {@link StartTlsRequestClassTests}).
 */

@RunWith(J8Unit4.class)
public class StartTlsRequestClassTest
implements StartTlsRequestClassTests<StartTlsRequest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.StartTlsRequest]

    @Override
    public Class<StartTlsRequest> createNewSUT() {
        return StartTlsRequest.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.StartTlsRequest#StartTlsRequest() public javax.naming.ldap.StartTlsRequest()}.
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
    public void create_StartTlsRequest()
    throws Exception {
        // create new instance
        final StartTlsRequest sut = new StartTlsRequest();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.StartTlsRequest]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.StartTlsRequest]

}
