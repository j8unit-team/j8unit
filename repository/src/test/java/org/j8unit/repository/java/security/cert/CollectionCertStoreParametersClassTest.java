package org.j8unit.repository.java.security.cert;

import java.security.cert.CollectionCertStoreParameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CollectionCertStoreParameters} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.CollectionCertStoreParametersClassTests}).
 */

@RunWith(J8Unit4.class)
public class CollectionCertStoreParametersClassTest
implements CollectionCertStoreParametersClassTests<CollectionCertStoreParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CollectionCertStoreParameters]

    @Override
    public Class<CollectionCertStoreParameters> createNewSUT() {
        return CollectionCertStoreParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CollectionCertStoreParameters#CollectionCertStoreParameters(java.util.Collection)
     * public java.security.cert.CollectionCertStoreParameters(java.util.Collection<?>)}.
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
    public void create_CollectionCertStoreParameters_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CollectionCertStoreParameters sut = null; // = new CollectionCertStoreParameters(java.util.Collection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CollectionCertStoreParameters#CollectionCertStoreParameters() public
     * java.security.cert.CollectionCertStoreParameters()}.
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
    public void create_CollectionCertStoreParameters()
    throws Exception {
        // create new instance
        final CollectionCertStoreParameters sut = new CollectionCertStoreParameters();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CollectionCertStoreParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CollectionCertStoreParameters]

}
