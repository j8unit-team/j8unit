package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLParameters;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLParameters} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLParametersClassTests}).
 */

@RunWith(J8Unit4.class)
public class SSLParametersClassTest
implements SSLParametersClassTests<SSLParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLParameters]

    @Override
    public Class<SSLParameters> createNewSUT() {
        return SSLParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.net.ssl.SSLParameters#SSLParameters()
     * public javax.net.ssl.SSLParameters()}.
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
    public void create_SSLParameters()
    throws Exception {
        // create new instance
        final SSLParameters sut = new SSLParameters();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.SSLParameters#SSLParameters(String[]) public
     * javax.net.ssl.SSLParameters(java.lang.String[])}.
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
    public void create_SSLParameters_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SSLParameters sut = null; // = new SSLParameters(String[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.SSLParameters#SSLParameters(String[], String[]) public
     * javax.net.ssl.SSLParameters(java.lang.String[],java.lang.String[])}.
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
    public void create_SSLParameters_StringArray_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SSLParameters sut = null; // = new SSLParameters(String[], String[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLParameters]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLParameters]

}
