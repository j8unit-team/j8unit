package org.j8unit.repository.java.security;

import java.security.AlgorithmParameters;
import java.security.Provider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParametersClassTest
implements org.j8unit.repository.java.security.AlgorithmParametersClassTests<AlgorithmParameters> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AlgorithmParameters]

    @Override
    public Class<AlgorithmParameters> createNewSUT() {
        return AlgorithmParameters.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AlgorithmParameters#getInstance(String, Provider)
     * public static java.security.AlgorithmParameters
     * java.security.AlgorithmParameters.getInstance(java.lang.String,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_Provider()
    throws Exception {
        // write some test for {@link AlgorithmParameters#getInstance(String, Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AlgorithmParameters#getInstance(String, String)
     * public static java.security.AlgorithmParameters
     * java.security.AlgorithmParameters.getInstance(java.lang.String,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
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
    public void test_getInstance_String_String()
    throws Exception {
        // write some test for {@link AlgorithmParameters#getInstance(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AlgorithmParameters#getInstance(String) public
     * static java.security.AlgorithmParameters java.security.AlgorithmParameters.getInstance(java.lang.String) throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link AlgorithmParameters#getInstance(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AlgorithmParameters]

}
