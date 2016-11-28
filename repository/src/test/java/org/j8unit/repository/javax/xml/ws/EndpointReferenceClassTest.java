package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.EndpointReference;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EndpointReference} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.EndpointReferenceClassTests}).
 */
@RunWith(J8Unit4.class)
public class EndpointReferenceClassTest
implements EndpointReferenceClassTests<EndpointReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.EndpointReference]

    @Override
    public Class<EndpointReference> createNewSUT() {
        return EndpointReference.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.ws.EndpointReference#readFrom(javax.xml.transform.Source) public static
     * javax.xml.ws.EndpointReference javax.xml.ws.EndpointReference.readFrom(javax.xml.transform.Source)}.
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
    public void test_readFrom_Source()
    throws Exception {
        // write some test for {@link javax.xml.ws.EndpointReference#readFrom(javax.xml.transform.Source)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.EndpointReference]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.EndpointReference]

}
